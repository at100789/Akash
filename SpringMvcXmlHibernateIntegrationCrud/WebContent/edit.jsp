<%@page import="com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%Customer customer = (Customer)request.getAttribute("c");%>
<body>
<h1>.....</h1>
<form action="Up">
<pre><br><br>
 <input type="hidden" name = "id" value = "<%=customer.getId()%>"><br><br>
Name :<input type="text" name = "name" value = "<%=customer.getName()%>"><br><br>
Address :<input type="text" name = "address" value = <%=customer.getAddress()%>><br><br>
UserName :<input type="text" name = "uname" value = <%=customer.getUname()%>><br><br>
PassWord : <input type="password" name = "pass" value = <%=customer.getPass() %>><br><br>

<input type="submit" value = "Update"> 
</pre>
</form>
</body>
</html>