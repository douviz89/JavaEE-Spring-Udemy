<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
	First name: <form:input path="firstName"/>
	<br><br>
	Last name(*): <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	
	<input type="submit" value="Submit"/>

</form:form>
</body>
</html>