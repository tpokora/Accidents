<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="<c:url value="/resources/js/formValidation.js" />" type="text/javascript"></script>
<style>
	.error {
		color: red;	
		display: none;
	}
</style>
</head>
<body>
<h2>Nowy Pacjent:</h2>
	<form:form id="patientForm" action="new" modelAttribute="patient" onsubmit="return newPatientformValidation('patientForm')">
		<div>Imie:</div><div><form:input path="firstName" name="firstName" />
		<div id="ferror" class="error">Nie podales imienia!</div></div>
		<div>Nazwisko:</div><div><form:input path="lastName" name="lastName" />
		<div id="lerror" class="error">Nie podales nazwiska!</div></div>
		<div>Uraz:</div><div><form:textarea path="accident" name="accident" />
		<div id="aerror" class="error">Nie opisales urazu!</div></div>
		<div>Data wypadku:</div><div><form:input path="accidentDate" name="accidentDate" 
			placeholder="DD/MM/YYYY HH:MM"/>
		<div id="aderror" class="error">Zly format daty!</div></div>
		<div><input type="submit" value="Dodaj pacjenta" /></div>
	</form:form>
	<p><a href="<c:url value="/"/>">Powrót</a>
</body>
</html>