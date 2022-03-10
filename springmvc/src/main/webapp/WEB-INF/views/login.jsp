<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<fieldset>
		<legend>Employee Details</legend>
		<form action="./login" method="post">
			<table>
				<tr> <td> <input type="number" name="user" placeholder="Enter Your Id"> </td> </tr>
				<tr> <td> <input type="password" name="password" placeholder="Enter Your Password"> </td> </tr>
				<tr> <td> <input type="submit" value="Login"> </td> </tr>
			</table>
		</form>
	</fieldset>
</body>
</html>