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


Name: <form:input path="name" />
		<p />
Gender: <form:radiobuttons path="gender" items="${gender}" />
		<p />
		
Country: <form:select path="country" items="${countryMap}" />
		<p />
Introduction: 
			<form:textarea path="introduction"/>
			<p/>
		<input type="submit" value="Submit">


	</form:form>
</body>
</html>



