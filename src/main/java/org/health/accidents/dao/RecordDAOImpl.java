package org.health.accidents.dao;

import java.util.ArrayList;

import org.health.accidents.entity.PatientEntity;
import org.health.accidents.entity.RecordEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecordDAOImpl implements RecordDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(RecordEntity record) {
		sessionFactory.getCurrentSession().save(record);
	}

	@Override
	public ArrayList<RecordEntity> getRecordsList(int patientId) {
		Query q = sessionFactory.getCurrentSession().getNamedQuery("getRecordsById");
		q.setParameter("pid", patientId);
		return (ArrayList<RecordEntity>) q.list();
	}

}
