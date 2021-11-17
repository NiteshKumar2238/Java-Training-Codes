package org.impelsys.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("Initializing ServletOne");
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{	
	
		System.out.println("Handling post request 1234");
		response.setContentType("text/html");
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader("Expires",0);
		//set response content type
		
		PrintWriter pw=response.getWriter();
		String str=request.getParameter("uname");
		pw.println("Hello "+str);
		//saves user name
		Cookie userCookie=new Cookie("uName",str);
		response.addCookie(userCookie);
		pw.println("<form action='/two'>");
		pw.println("</form>");
		
	}
	
}
