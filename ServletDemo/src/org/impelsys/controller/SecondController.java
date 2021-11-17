package org.impelsys.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/secondServlet")
public class SecondController extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("Initializing SecondController&&&&");
	
	}
	
//	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
//	{
//		PrintWriter out=response.getWriter();
//		Cookie cookie[]=request.getCookies();
//		String userName=cookie[0].getValue();
//		if(userName==null)
//			out.println("Invalid user");
//		else
//			out.println("Hello" + userName + " You are in 2nd page");
////		for(Cookie c:cookie){
////			out.println("Hello"+ userName +" .You are in the 2nd page");
////		}
//		//out.println("Hello"+cookie[0].getValue() +" .You are in the 2nd page");
//	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);
		String userName=null;
		
		if(session!=null)
			userName=(String) session.getAttribute("userName");
		
		if(userName==null)
			out.println("Invalid user");
		else{
			response.setHeader("Cache-Control","no-store");
			response.setDateHeader("Expires",0);
			response.setContentType("text/html");
			out.println("<html><body bgcolor='cyan'>");
			out.println("Hello " + userName + " You are in 2nd page");
		//System.out.println("Handling secondController post");
			out.println("</body></html>");
		}
		
	}
}
