package org.health.accidents.service;

import java.util.ArrayList;

import org.health.accidents.dao.RecordDAO;
import org.health.accidents.entity.RecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecordServiceImpl implements RecordService {

	private static final Logger logger =
			LoggerFactory.getLogger(RecordServiceImpl.class);
	
	@Autowired 
	private RecordDAO recordDAO;
	
	@Transactional
	@Override
	public void create(RecordEntity record) {
		recordDAO.create(record);
		logger.info("Dodano rekord: " + record.getDescription());
	}

	@Transactional
	@Override
	public ArrayList<RecordEntity> getRecordsList(int patientId) {
		return recordDAO.getRecordsList(patientId);
	}

}
