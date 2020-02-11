<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


		<form:form action="update-student" modelAttribute="student" method="POST">
		
		<form:hidden path="id" />
				
		
		Email: <form:input placeholder="${student.name}" path="email" />
		<br><br>
		Name: <form:input placeholder="${student.surname}" path="name"/>
		<br><br>
		Surname: <form:input placeholder="${student.email}" path="surname"/>
		<br><br>
		<input type="submit" value="save">
	</form:form>

</body>
</html>