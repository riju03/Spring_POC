<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h4>Home Page: List of users in the project</h4>
<hr/>
<table border="1" >
<tr>
<th>USER ID</th>
<th>NAME</th>
<th>EMAIL</th>
</tr>
<c:forEach items= "${users}" var="user">
<tr>
<td> ${user.userId }</td>
<td> ${user.name }</td>
<td> ${user.email }</td>

</tr>

</c:forEach>


</table>
</body>
</html>

