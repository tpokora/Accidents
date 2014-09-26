/**
 * 
 */

function dateValidation(str) {
	var pattern = new RegExp('^[0-9]{2}/[0-9]{2}/[0-9]{4} [0-9]{2}:[0-9]{2}');
	return pattern.test(str) ? true : false;
}

function newPatientformValidation(formName) {
	var form = document.getElementById(formName);
	var errors = 0;
	if (form.firstName.value == '') {
		ferror.style.display = "block";
		errors = 1;
	} else {
		ferror.style.display = "none";
	}
	if (form.lastName.value == '') {
		lerror.style.display = "block";
		errors = 1;
	} else {
		lerror.style.display = "none";
	}
	if (form.accident.value == '') {
		aerror.style.display = "block";
		errors = 1;
	} else {
		aerror.style.display = "none";
	}
	if (!dateValidation(form.accidentDate.value)) {
		aderror.style.display = "block";
		errors = 1;
	} else {
		aderror.style.display = "none";
	}

	if (errors == 1)
		return false;
	else
		return true;
}