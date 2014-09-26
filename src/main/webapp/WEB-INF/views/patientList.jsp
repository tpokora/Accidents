<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" /> " />
<link rel="stylesheet" href="<c:url value="/resources/css/patientList.css" /> " />
<script type="text/javascript">
	function redirect(patientId) {
		document.location='patient/' + patientId;
	}
</script>
</head>
<body>
<div id="wrapper">
	<h2>Lista pacjentów:</h2>
	<ul id="patientList">
		<c:forEach var="patient" items="${patientList}">
			<li>
				<div onclick="redirect(${patient.id})">
					<ul>
						<li>${patient.firstName} ${patient.lastName}</li>
						<li>${patient.accident}</li>
						<li>${patient.accidentDate}</li>
					</ul>
				</div>
			</li>
		</c:forEach>
	</ul>
	<div class="homeLink"><a href="<c:url value="/"/>">Strona glowna</a></div>
</div>
</body>
</html>