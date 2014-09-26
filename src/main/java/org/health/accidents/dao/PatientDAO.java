package org.health.accidents.dao;

import java.util.ArrayList;

import org.health.accidents.entity.PatientEntity;

public interface PatientDAO {
	public void create(PatientEntity patient);
	public ArrayList<PatientEntity> getPatientList();
	public PatientEntity getPatientById(int id);
}
