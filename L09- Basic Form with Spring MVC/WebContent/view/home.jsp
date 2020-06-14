<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello This is my first Spring MVC program

   <%-- form will be submitted through url /displayname --%>
	<form action="displayname">
		<input type="text" name="firstName">
		 <input type="submit" value="submit">

	</form>
</body>
</html>