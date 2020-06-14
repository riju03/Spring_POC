<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
</head>
<body>
<%-- in the background we are calling the getter method --%>
Name : ${user.name}<p/>
Gender : ${user.gender}
Country: ${user.country}
Introduction: ${user.introduction}
Country visited:
<ul>
<c:forEach var="country" items="${user.countryVisited}">

<li>${country}</li> 

</c:forEach>
</ul>
</body>
</html>