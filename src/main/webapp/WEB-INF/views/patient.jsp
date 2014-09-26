<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="<c:url value="/"/>">Strona glowna</a>
	<h2>Pacjent:</h2>
	<div>Imie: ${patient.firstName}</div>
	<div>Nazwisko: ${patient.lastName}</div>
	<div>Uraz: ${patient.accident}</div>
	<div>Data: ${patient.accidentDate}</div>
	<h3>Wpis z leczenia:</h3>
	<form:form action="newrecord" modelAttribute="record">
		<div>
			Data:
			<form:input path="entryDate" placeholder="DD/MM/YYYY HH:MM" />
		</div>
		<div>
			Stopien bolu:
			<form:select path="painLvl" items="${painLevelComboBox}" />
		</div>
		<div>Opis:</div>
		<div>
			<form:textarea path="description" />
		</div>
		<div>
			<input type="submit" value="Dodaj" />
		</div>
	</form:form>
	<hr />
	Leczenie:
	<table>
		<tr>
			<th>Opis</th>
			<th>Nasilenie bólu</th>
			<th>Data</th>
		</tr>
		<c:forEach var="record" items="${records}">
			<tr>
				<td>${record.description}</td><td>${record.painLvl}</td><td>${record.entryDate}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>