<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.error {
	color: red
}
</style>

</head>
<body>

		<form:form action="save-student" modelAttribute="student" method="POST">
		
		<form:hidden path="id" />
				
		Login: <form:input path="login" />
		<form:errors path="login" cssClass="error" />
		<br><br>
		Password: <form:password path="password" />
		<form:errors path="password" cssClass="error" />
		<br><br>
		Email: <form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br><br>
		Name: <form:input path="name"/>
		<form:errors path="name" cssClass="error" />
		<br><br>
		Surname: <form:input path="surname"/>
		<form:errors path="surname" cssClass="error" />
		<br><br>
		<input type="submit" value="save">
	</form:form>
	
	<p><a href="main-page">main</a></p>

</body>
</html>