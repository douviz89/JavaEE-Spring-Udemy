<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Country: 
		<form:select path="country">
			<form:options items="${ student.countryOptions }"/>
		</form:select>
		<br><br>
		Favorite language:
		<form:radiobuttons path="favLanguage" items="${ student.languages }"/>
		<br><br>
		Operating Systems:
		<form:checkboxes path="operatingSystems" items="${ student.opSystems }"/>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>