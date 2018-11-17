<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Sign Up!</h2>

<form action = "signup">
Id: <input type = "text", name = "empid"><br><br>
Name: <input type = "text", name = "empname"><br><br>
Salary: <input type = "text", name = "empsalary"><br><br>
Gender: <input type="radio" name="gender" value="male" checked> Male
 		 <input type="radio" name="gender" value="female"> Female<br><br> 
Address ID: <input type = "text",  name = "empaddress"><br><br>
Age: <input type = "text", name = "empage"><br><br>
Vehicle ID: <input type = "text", name = "empvid"><br><br>
<input type = "submit", value = "Sign Up">
</form> 

</body>
</html>