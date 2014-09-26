package org.health.accidents.service;

import java.util.ArrayList;

import org.health.accidents.entity.RecordEntity;

public interface RecordService {
	public void create(RecordEntity record);
	public ArrayList<RecordEntity> getRecordsList(int patientId);
}
