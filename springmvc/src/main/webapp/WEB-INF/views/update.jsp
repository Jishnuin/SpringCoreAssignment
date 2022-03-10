<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>


<%
Integer empId = (Integer) request.getAttribute("id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<br>
	<br>
	<fieldset>
		<legend>Update Employee</legend>
		<form action="./update_emp" method="post">
			<table>
				<tr>
					<td><input type="number" name="id" value=<%=empId%>></td>
				</tr>
				<tr>
					<td><input type="text" name="name"
						placeholder="Update Employee Name"></td>
				</tr>
				<tr>
					<td><input type="text" name="place"
						placeholder="Update Employee place"></td>
				</tr>
				<tr>
					<td><input type="number" name="sal"
						placeholder="Update Employee salary"></td>
				</tr>
				<tr>
					<td><input type="password" name="password"
						placeholder="Update Employee password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>