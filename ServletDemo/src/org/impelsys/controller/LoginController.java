package org.impelsys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session=request.getSession(true);
		session.setAttribute("userName",request.getParameter("userName"));
		response.sendRedirect("welcome.html");
	}
}
