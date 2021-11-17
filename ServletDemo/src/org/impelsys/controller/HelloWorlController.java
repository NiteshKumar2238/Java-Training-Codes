package org.impelsys.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(value="/hello",initParams={
		@WebInitParam(name="driverName",value="oracle.jdbc.odbc.OracleDriver"),
		@WebInitParam(name="dbUserName",value="user1")
		
})  //request mapping
//for every request new thread is created
public class HelloWorlController extends HttpServlet {
	private String userName;
	private int hitCounter;
	
	//init is called only first time a request is recieved
	public void init(ServletConfig config) throws ServletException{
		
		ServletContext context=config.getServletContext();
		String projectName=context.getInitParameter("projectName");
		//System.out.println(projectName);
		//System.out.println("Initializing HelloWorldController");
		
		String driverName=config.getInitParameter("driverName");
		System.out.println("Loading driver : "+driverName);
		System.out.println("Initializing project : "+projectName);
		hitCounter=0;
	}
	
	//service method handles incoming request
	//
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{	
		hitCounter++;
		System.out.println("Handling incoming request");
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader("Expires",0);
		//set response content type
		PrintWriter pw=response.getWriter();
		String str=request.getParameter("userName");
		pw.println("<div bgcolor=\"cyan\">");
		pw.println("Hello "+str+ "You are visitor number:" + hitCounter);
		pw.println("</div>");
	}
	
	//handles only post request
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{	
	
		System.out.println("Handling post request 123");
		response.setContentType("text/html");
		response.setHeader("Cache-Control","no-store");//fresh page from server
		response.setDateHeader("Expires",0);//never store under no cir
		//RequestDispatcher reqDispatcher=request.getRequestDispatcher("secondServlet");
		//reqDispatcher.forward(request, response);//req scope
		//reqDispatcher.include(request, response);
		
		
		
		PrintWriter pw=response.getWriter();
		String userName=request.getParameter("userName");
		pw.println("Hello " + userName);
		
		HttpSession session=request.getSession();
		session.setAttribute("userName",userName);
		
		System.out.println("Redirecting to 2nd servlet...");
		response.setStatus(307);
		response.sendRedirect("secondServlet");
		//saves user name
//		Cookie userCookie=new Cookie("uname",str);
//		//userCookie.setMaxAge(10);
//		response.addCookie(userCookie);
		
//		pw.println("<form action='secondServlet'>");
//		pw.println("<input type='submit' value='Go'>");
//		pw.println("</form>");
		
//		RequestDispatcher reqDispatcher=request.getRequestDispatcher("secondServlet");//dispatching of request
//		reqDispatcher.forward(request, response);
	}
//	
	//destroy methods called after removing servlet instance from the
	public void destroy(){
		//clean-up activities
		System.out.println("in destroy");
	}
}
