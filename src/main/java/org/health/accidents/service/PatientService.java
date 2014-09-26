package org.health.accidents.service;

import java.util.ArrayList;

import org.health.accidents.entity.PatientEntity;


public interface PatientService {
	public void create(PatientEntity patient);
	public ArrayList<PatientEntity> getPatientList();
	public PatientEntity getPatientById(int id);
}
