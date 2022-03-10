<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<% String msg = (String) request.getAttribute("msg");
		out.println("Welcome "+ msg);
		
	
	%>
	<% String error = (String) request.getAttribute("errmsg");
	/* out.println(error); */
	%>
</body>
</html>