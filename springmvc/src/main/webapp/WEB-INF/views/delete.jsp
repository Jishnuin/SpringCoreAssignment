<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<br>
<br>
<% String msg = (String) request.getAttribute("msg"); %>
<%= msg %>
<form action="./deleteemp" method="post">
	<input type="number" name="id" placeholder="Enter Emp Id"> <input type="submit" value="delete">
</form>
</body>
</html>