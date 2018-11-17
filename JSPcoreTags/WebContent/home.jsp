<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="a" value="200"></c:set>
	<c:out value="${a}"></c:out>
	<br />

 	<c:set var="b" value="${200*5}"></c:set>
	<c:out value="${b}"/>
	<br />

	<c:set var="a" value="40"/>
	<c:if test="${a>30}">
		<c:out value="the value is greater than 30"></c:out>
		<br>
	</c:if>
	<c:out value="outside if condition"></c:out>

	<c:set var="number" value="${10*20 }" />
	<c:choose>
	<c:when test="${number>=190 }">
		the number is greater than 190.
	</c:when>
	<c:otherwise>
	
		<c:redirect url="welcome.jsp" /> 
	</c:otherwise>
	
	</c:choose>


</body>
</html>