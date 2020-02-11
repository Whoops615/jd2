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

		<table border="1">
	
	<c:forEach var="tempInstructor" items="${instructors}">
	
		<tr>
			<td>${tempInstructor.id}</td>
			<td>${tempInstructor.name}</td>
			<td>${tempInstructor.surname}</td>
			<td>${tempInstructor.email}</td>
			<td>${tempInstructor.instructorDetail.hobby}</td>
			<td>${tempInstructor.instructorDetail.car}</td>
			
		
		</tr>
	
	</c:forEach>
	
	</table>

</body>
</html>