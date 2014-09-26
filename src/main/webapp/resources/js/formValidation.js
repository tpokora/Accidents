/**
 * 
 */

function dateValidation(str) {
	var pattern = new RegExp('^[0-9]{2}/[0-9]{2}/[0-9]{4} [0-9]{2}:[0-9]{2}');
	return pattern.test(str) ? true : false;
}

function formValidation(formName) {
	var form = document.getElementById(formName);
	var errors = 0;
	if (form.firstName.value == '') {
		ferror.innerHTML = 'Nie podales imienia';
		errors = 1;
	}
	if (form.lastName.value == '') {
		lerror.innerHTML = 'Nie podales nazwiska';
		errors = 1;
	}
	if (form.accident.value == '') {
		aerror.innerHTML = 'Nie opisales urazu';
		errors = 1;
	}
	if (!dateValidation(form.accidentDate.value)) {
		aderror.innerHTML = 'Zly format daty';
		errors = 1;
	}

	if (errors == 1)
		return false;
	else
		return true;
}