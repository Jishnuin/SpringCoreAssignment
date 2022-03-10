<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.tech.springmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<% List<Employee> emp= (List<Employee>) request.getAttribute("details");  %>
<%= emp %>
</body>
</html>