<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.Date"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String userName =  request.getParameter("username");
out.write("hello " + userName);
%>
<br>
<%
Date date = new Date();
out.write("today is " + date);


int a = 5;
int b = 10;
%>

<br>
The sum is <%=sum(a,b) %>


<%! int sum(int x, int y){
	return (x+y);
}
%>

</body>
</html>