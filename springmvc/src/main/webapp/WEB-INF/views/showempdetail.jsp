<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navbar.jsp" %>
    
   <% Object object = request.getAttribute("details"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<form action="./showempdet" method="post">
		<input type="number" name="id" placeholder="Enter Emp ID"> <input type="submit" value="Search">
	</form>
	
	<%= object %>
</body>
</html>