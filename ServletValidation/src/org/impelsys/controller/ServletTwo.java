package org.impelsys.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTwo {

	public void init(ServletConfig config) throws ServletException{
		System.out.println("Initializing Servlet2");
	
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		Cookie cookie[]=request.getCookies();
//		for(Cookie c:cookie){
//			out.println("Hello"+ userName +" .You are in the 2nd page");
//		}
		out.println("Hello"+cookie[0].getValue() +" .You are in the 2nd page");
	}
	
}
