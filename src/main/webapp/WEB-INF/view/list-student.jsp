<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
	
	<c:forEach var="tempStudent" items="${students}">
	
		<tr>
			<td>${tempStudent.id}</td>
			<td>${tempStudent.name}</td>
			<td>${tempStudent.surname}</td>
			<td>${tempStudent.email}</td>
			<td>
			
			<form action="delete-student" method="get">
			<input type="hidden" name="IdStudent" value="${tempStudent.id}">
			<input type="submit" value="delete">
			</form>
			
			</td>
			
			<td>
			
			<form action="form-update-student" method="post">
			<input type="hidden" name="IdStudent" value="${tempStudent.id}">
			<input type="submit" value="update">
			</form>
			
			
			</td>
		
		</tr>
	
	</c:forEach>
	
	</table>

</body>
</html>