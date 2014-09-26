package org.health.accidents.service;

import java.util.ArrayList;

import org.health.accidents.dao.PatientDAO;
import org.health.accidents.entity.PatientEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientServiceImpl implements PatientService {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(PatientServiceImpl.class);

	@Autowired
	private PatientDAO patientDAO;

	@Transactional
	@Override
	public void create(PatientEntity patient) {
		patientDAO.create(patient);
		logger.info("Patient: " + patient.getFirstName() + " " 
				+ patient.getLastName() + " added to database");
	}

	@Transactional
	@Override
	public ArrayList<PatientEntity> getPatientList() {
		return patientDAO.getPatientList();
	}

	@Transactional
	@Override
	public PatientEntity getPatientById(int id) {
		return patientDAO.getPatientById(id);
	}
}
