package org.health.accidents.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.NamedQuery;

@NamedQuery(
		name = "getRecordsById",
		query = "FROM RecordEntity WHERE patient_id = :pid ORDER BY entryDate DESC")
@Entity
@Table(name = "patientRecords")
public class RecordEntity {
	private int id;
	private Date entryDate;
	private int painLvl;
	private String description;
	private int patientId;
	
	public RecordEntity() {}
	
	public RecordEntity(Date entryDate, int painLvl, String description, int patientId) {
		this.entryDate = entryDate;
		this.painLvl = painLvl;
		this.description = description;
		this.patientId = patientId;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "entryDate")
	public Date getEntryDate() {
		return entryDate;
	}
	
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	@Column(name = "painlvl")
	public int getPainLvl() {
		return painLvl;
	}
	
	public void setPainLvl(int painLvl) {
		this.painLvl = painLvl;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "patient_id")
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
}

