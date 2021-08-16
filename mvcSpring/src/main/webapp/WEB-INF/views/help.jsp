<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
    <%@page import="java.time.LocalDateTime" %>
    <%@page  isELIgnored="false"%>//jsp expression language to print value
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

<h1>This guy need help</h1>
 <h3>${common }</h3>
<!-- %
String name1=(String) request.getAttribute("name");
Integer roll1=(Integer)request.getAttribute("roll");
LocalDateTime tym=(LocalDateTime) request.getAttribute("time");
%-->

<h1>Hello <!--  %=name1%-->${name}</h1>
<h1> This is your roll number=<!--  %=roll1%-->${roll}</h1>
<h1> The time is being is=<!--  %=tym% -->${time}</h1>
<hr>
${marks}
<c:forEach var="item" items="${marks }"><!-- this tag support jstl tag and jstl maven dependancy in pom.xml  -->
<h1>${item }</h1>
<hr>
<c:out value="item"></c:out>
</c:forEach>
</body>
</html>