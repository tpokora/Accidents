<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
	<link rel="stylesheet" href="<c:url value="/resources/css/home.css" />" />
</head>
<body>
<div id="wrapper">
	<h1>
		Welcome to Accidents manager!
	</h1>
	<div>
		<div class="homeLink">
			<a href="newPatient">Dodaj pacjenta</a>
		</div>
		<div class="homeLink">
			<a href="patientList">Lista pacjentow</a>
		</div>
	</div>
</div>
</body>
</html>
