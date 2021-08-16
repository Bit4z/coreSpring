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
<h1> We are making this form using @ModelAttribute</h1><br>
 <h3>${common }</h3>
</center>
<hr>
<h1>name=${user.name}</h1><!-- here name email name and password should be same as User class varalble and user is a object which is coming frrom contact controller class  -->
<h1>email=${user.email}</h2>
<h1>password=${user.password}</h1>
</body>
</html>