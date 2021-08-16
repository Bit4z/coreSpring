<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page  isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Status Success</h1>
</center>
<%
String name=(String) request.getAttribute("name");
String email=(String) request.getAttribute("email");
String password=(String) request.getAttribute("password");


%>
<h1>name=<%=name %></h1>
<h1>email=<%=email %></h2>
<h1>password=<%=password %></h1>
<hr>
<center>
<h1> output using jstl tag</h1>
</center>

<h1>name=${name}</h1>
<h1>email=${email}</h2>
<h1>password=${password}</h1>
<hr>
<center>
<h1> We are used making user class object for fetching the data</h1>
</center>

<h1>name=${User.name}</h1>
<h1>email=${User.email}</h2>
<h1>password=${User.password}</h1>
</body>
</html>