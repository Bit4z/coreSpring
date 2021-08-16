<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is Home Page</h1>
<h1>Called by home controller</h1>
<%
String name=(String) request.getAttribute("name");
Integer price=(Integer)request.getAttribute("price");
List<String> friend=(List<String>) request.getAttribute("f");
%>
<h1> This is <%=name%> which is coming from controller..</h1>
<h1> This is <%=price%> which is coming from controller..</h1>
<h1>url /home</h1>
<%
for(String s:friend)
{
	%>
	<h1><%=s %></h1>
<% 
}
%>
</body>
</html>