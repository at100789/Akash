<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>--Hello New Spring MVC--</h1>

	<form action="pagecall">
		<input type="submit" value="OK">
	</form>

	<h2>--Use Request Param To Get Data--</h2>
	<form action="requestparam">
		username = <input type="text" name="uname"><br>
		<br> password = <input type="text" name="pass"><br>
		<br> <input type="submit" value="OK">

	</form>
	<a href="register.jsp"> Register Here</a><br><br> 
	<a href="studentregister.jsp"> Student Details Register</a>
</body>
</html>