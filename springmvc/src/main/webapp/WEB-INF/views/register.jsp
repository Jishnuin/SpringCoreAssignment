<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
</head>
<body>
<br>
<br>
<% String msg = (String) request.getAttribute("msg"); %>
<%if(msg!=null && !msg.isEmpty()) {%>
<h1>
<%= msg %>
</h1>
<%} %>
	<fieldset>
		<legend>Register Employee</legend>
		<form action="./addemp" method="post">
			<table>
				<tr> <td> <input type="number" name="id" placeholder="Enter New Employee Id"> </td> </tr>
				<tr> <td> <input type="text" name="name" placeholder="Enter Employee Name"> </td> </tr>
				<tr> <td> <input type="text" name="place" placeholder="Enter Employee place"> </td> </tr>
				<tr> <td> <input type="number" name="sal" placeholder="Enter Employee salary"> </td> </tr>
				<tr> <td> <input type="password" name="password" placeholder="Enter Employee password"> </td> </tr>
				<tr> <td> <input type="submit" value="Register"> </td> </tr>
			</table>
		</form>
	</fieldset>
</body>
</html>