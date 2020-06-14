<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="displayUserInfo" modelAttribute="user">
<p/>
<%--path: whenever we submit the form spring will call in setter method based on object user
	to use radiobuttons we need to generate a map and based on the map our gender form will be generated
	
	it will return value in the form and after submission it will return key depending on the value
 --%>
Name: <form:input path="name"/>
Gender: <form:radiobuttons path="gender" items="${gender}"/>
		
		<p/>
		
		<input type="submit" value = "Submit">
</form:form>
</body>
</html>