package org.health.accidents.web;

import org.health.accidents.entity.PatientEntity;
import org.health.accidents.model.PatientForm;
import org.health.accidents.service.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccidentFormController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccidentFormController.class);
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value = "/newPatient", method = RequestMethod.GET)
	public String getNewPatientForm(@ModelAttribute("patient") PatientForm patientForm,
			Model model) {
		logger.info("Adding new patient form page");
		return "newPatientForm";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String postNewPatientForm(@ModelAttribute("patient") PatientForm patientForm,
			Model model) {
		logger.info("Adding new patient");
		patientService.create(patientFormToEntity(patientForm));
		return "newPatientProcessPage";
	}

	private PatientEntity patientFormToEntity(PatientForm patientForm) {
		return new PatientEntity(patientForm.getFirstName(), 
				patientForm.getLastName(), 
				patientForm.getAccident(), 
				patientForm.getAccidentDate());
	}
}
