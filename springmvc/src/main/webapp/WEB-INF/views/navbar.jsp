<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	a{
		border: 1px solid black;
		text-decoration: none;
		text-transform: capitalize;
		padding: 10px;
		margin-left: 100px;
		background-color: orange;
		color: white;
		border-radius: 25px;
	}
	a:hover {
	padding: 20px;
	color: black;
	}
	div{
		background-color: teal;
	}
</style>
</head>
<body>
	<div>
		<a href="./register">Add Employee</a>
		<a href="./update">Update Employee</a>
		<a href="./delete">Delete Employee</a>
		<a href="./show">Show Employee</a>
		<a href="./showallemp">Show All Employees</a>
		<a href="">Logout</a>
	</div>
</body>
</html>