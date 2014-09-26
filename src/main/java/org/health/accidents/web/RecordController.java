package org.health.accidents.web;

import javax.validation.Valid;

import org.health.accidents.entity.RecordEntity;
import org.health.accidents.model.RecordForm;
import org.health.accidents.service.RecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("spatientId")
@Controller
public class RecordController {
	private static Logger logger = 
			LoggerFactory.getLogger(RecordController.class);
	
	@Autowired
	private RecordService recordService;
	
	@RequestMapping(value = "patient/newrecord", method = RequestMethod.POST)
	public String postRecordForm(@ModelAttribute("record") @Valid RecordForm recordForm,
			@ModelAttribute("spatientId") int patientId,
			BindingResult result,
			Model model) {
		model.addAttribute("Id", patientId);
		System.out.println(recordForm.getEntryDate());
		recordService.create(recordFormToEntity(recordForm, patientId));
		return "newrecord";
	}
	
	private RecordEntity recordFormToEntity(RecordForm recordForm, int patientId) {
		return new RecordEntity(recordForm.getEntryDate(), recordForm.getPainLvl(),
				recordForm.getDescription(), patientId);
	}
}
