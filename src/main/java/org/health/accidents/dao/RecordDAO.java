package org.health.accidents.dao;

import java.util.ArrayList;

import org.health.accidents.entity.RecordEntity;

public interface RecordDAO {
	public void create(RecordEntity record);
	public ArrayList<RecordEntity> getRecordsList(int patientId);
}
