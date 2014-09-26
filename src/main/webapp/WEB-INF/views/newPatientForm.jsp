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
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />"/>
<link rel="stylesheet" href="<c:url value="/resources/css/newPatientStyle.css" />" />
<style>

</style>
</head>
<body>
<div id="wrapper">
<h2>Nowy Pacjent:</h2>
	<form:form id="patientForm" action="new" modelAttribute="patient" onsubmit="return newPatientformValidation('patientForm')">
		<div>Imie:</div>
		<div class="input"><form:input path="firstName" name="firstName" /></div>
		<div id="ferror" class="error">Nie podales imienia!</div>
		<div>Nazwisko:</div>
		<div class="input"><form:input path="lastName" name="lastName" /></div>
		<div id="lerror" class="error">Nie podales nazwiska!</div>
		<div class="patientFormLabel">Uraz:</div>
		<div class="input"><form:textarea path="accident" name="accident" /></div>
		<div id="aerror" class="error">Nie opisales urazu!</div>
		<div class="patientFormLabel">Data wypadku:</div>
		<div class="input"><form:input path="accidentDate" name="accidentDate" 
			placeholder="DD/MM/YYYY HH:MM"/></div>
		<div id="aderror" class="error">Zly format daty!</div>
		<input id="newPatientButton" type="submit" value="Dodaj pacjenta" />
	</form:form>
	<div class="homeLink"><a href="<c:url value="/"/>">Powrót</a></div>
</div>
</body>
</html>