<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello : ${firstName}<br/>
Date is :${date}<br/>
---------------------------------<br/>
List of team members: ${names}

<c:forEach var="temp" items="${names}">

<br>${temp}
</c:forEach>


</body>
</html>