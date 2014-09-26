package org.health.accidents.web;

import org.health.accidents.model.RecordForm;
import org.health.accidents.service.PatientService;
import org.health.accidents.service.RecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("spatientId")
@Controller
public class PatientListController {
	
	private static Logger logger = 
			LoggerFactory.getLogger(PatientListController.class);
	
	private static int[] painLevelCombobox = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private RecordService recordService;
	
	@RequestMapping(value = "/patientList")
	public String getPatientList(Model model) {
		model.addAttribute("patientList", patientService.getPatientList());
		return "patientList";
	}
	
	@RequestMapping(value = "/patient/{patientId}")
	public String patientDetails(@PathVariable int patientId,
			@ModelAttribute("record") RecordForm record,
			BindingResult result,
			Model model) {
		model.addAttribute("patient", patientService.getPatientById(patientId));
		model.addAttribute("painLevelComboBox", painLevelCombobox);
		model.addAttribute("records", recordService.getRecordsList(patientId));
		model.addAttribute("spatientId", patientId);
		return "patient";
	}
}
