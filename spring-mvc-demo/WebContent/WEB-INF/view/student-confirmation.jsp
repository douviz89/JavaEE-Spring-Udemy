<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmed Student</title>
</head>
<body>
	Student: ${ student.firstName } ${ student.lastName } is from ${ student.country }.
	<br> Favorite language: ${ student.favLanguage }.
	<br> Operating Systems:
	<ul>
		<c:forEach items="${ student.operatingSystems }" var="current">
			<li><c:out value="${ current }" /></li>
		</c:forEach>
	</ul>
</body>
</html>