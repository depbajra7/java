<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.newpackage.Program"></jsp:useBean>
	<jsp:setProperty property="str" name="obj"
		value="this is a response from my class" />

	<jsp:getProperty property="str" name="obj" />
	<br> 
	<br>

	<jsp:useBean id="object" class="com.mypackage1.MyClass"></jsp:useBean>
	<jsp:setProperty property="number" name="object" value="150000000"/>
	<jsp:getProperty property="number" name="object"/>
	<br>
	<%
	String userName = request.getParameter("username");
	out.write("hello" + userName);
	%>
	</body>
	</html> 
	
