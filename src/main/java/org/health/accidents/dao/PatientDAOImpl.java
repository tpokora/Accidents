package org.health.accidents.dao;

import java.util.ArrayList;

import org.health.accidents.entity.PatientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

@Repository
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(PatientEntity patient) {
		sessionFactory.getCurrentSession().save(patient);
	}
	
	@Override
	public ArrayList<PatientEntity> getPatientList() {
		Query q = sessionFactory.getCurrentSession().createQuery("from PatientEntity");
		ArrayList<PatientEntity> patientList = (ArrayList<PatientEntity>) q.list();
		return patientList;
	}

	@Override
	public PatientEntity getPatientById(int id) {
		Query q = sessionFactory.getCurrentSession().getNamedQuery("findPatientById");
		q.setParameter("id", id);
		return (PatientEntity) q.uniqueResult();
	}
	
}
