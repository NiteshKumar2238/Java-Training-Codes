<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String flag=null;
	if(session.getAttribute("isUserLoggedIn")!=null)
 		flag=(String)session.getAttribute("isUserLoggedin");
if(flag!=null && flag.equals("true")){
	Integer hitCount=(Integer) application.getAttribute("hitCount");
	System.out.println("Hit Count :"+hitCount);

if(hitCount==null || hitCount==0){
	out.println("Welcome to JSP");
	hitCount=1;
}


else{
	hitCount++;
	out.println("Welcome back to JSP.You are visitor no. : "+hitCount);
}
application.setAttribute("hitCount",hitCount);


%>
<%-- <%= authenticate() %> --%>
</body>
</html>