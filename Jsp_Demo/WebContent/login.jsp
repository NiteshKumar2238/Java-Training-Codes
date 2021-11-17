<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<h1>
</h1>
<%

session.setAttribute("isUserLoggedIn","true");

String uname=request.getParameter("userName");//request implicit objects
out.println("Welcome :" +uname);

String driverName=application.getInitParameter("driverName");
System.out.println("Driver name :" +driverName);

int hitCount=(Integer)application.getAttribute("hitCount");
out.println("You are visitor no. : "+hitCount);

%>
<p>JSP Expressions :<%= %>
</body>
</html>