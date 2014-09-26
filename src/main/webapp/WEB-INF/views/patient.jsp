<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" /> ">
<link rel="stylesheet" href="<c:url value="/resources/css/patient.css" /> ">
<script type="text/javascript" src="<c:url value="/resources/js/formValidation.js" />"></script>
</head>
<body>
<div id="wrapper">
	<div class="homeLink">
		<a href="<c:url value="/"/>">Strona glowna</a>
	</div>
	
	<h2>Pacjent:</h2>
	<div><b>Imie:</b> ${patient.firstName}</div>
	<div><b>Nazwisko:</b> ${patient.lastName}</div>
	<div><b>Uraz:</b> ${patient.accident}</div>
	<div><b>Data:</b> ${patient.accidentDate}</div>
	<h3>Wpis z leczenia:</h3>
	<form:form id="newrecordForm" action="newrecord" modelAttribute="record" 
		onsubmit="return newrecordFormValidation('newrecordForm');">
		<div>Data:</div>
		<div>
			<div style="float: left;">
				<form:input name="entryDate" path="entryDate" 
					placeholder="DD/MM/YYYY HH:MM" class="input" />
			</div>
			<div id="dateError" class="error errorOnRight">Zly format daty!</div>
			<br style="clear: both;" />
		</div>
		<div>
			Stopien bolu:
			<form:select path="painLvl" items="${painLevelComboBox}" />
		</div>
		<div>Opis:</div>
		<div>
			<div style="float: left;">
				<form:textarea name="description" path="description" class="input" />
			</div>
			<div id="descError" class="error errorOnRight">Brak opisu!</div>
			<br style="clear: both;" />
		</div>
		<input id="newrecordButton" type="submit" value="Dodaj" />
	</form:form>
	<hr />
	<table id="recordTable">
		<tr>
			<td id="tableHeader" colspan="3">Leczenie:</td>
		</tr>
		<tr>
			<th>Opis</th>
			<th>Nasilenie bólu</th>
			<th>Data</th>
		</tr>
		<c:forEach var="record" items="${records}">
			<tr class="record">
				<td>${record.description}</td>
				<c:choose>
					<c:when test="${(record.painLvl <= 10) && (record.painLvl > 8)}">
						<td class="center max"><b>${record.painLvl}</b></td>
					</c:when>
					<c:when test="${(record.painLvl < 9) && (record.painLvl > 6)}">
						<td class="center high"><b>${record.painLvl}</b></td>
					</c:when>
					<c:when test="${(record.painLvl < 7) && (record.painLvl > 4)}">
						<td class="center medium"><b>${record.painLvl}</b></td>
					</c:when>
					<c:when test="${(record.painLvl < 5) && (record.painLvl > 2)}">
						<td class="center low"><b>${record.painLvl}</b></td>
					</c:when>
					<c:otherwise>
						<td class="center min"><b>${record.painLvl}</b></td>
					</c:otherwise>
				</c:choose>
				<td class="center">${record.entryDate}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>