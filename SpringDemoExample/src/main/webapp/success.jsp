<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%List<Student> list = (List)request.getAttribute("s"); %>>
<body>
<form name="page">

<table>
<thead>
<tr>
<th>SELECT</th>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
</thead>


<tbody>
<tr>
<%for(Student s:list){%>
<td ></td>

<%}%>>
</tr>

</tbody>







</table>


</form>


</body>
</html>