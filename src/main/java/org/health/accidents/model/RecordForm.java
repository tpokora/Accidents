package org.health.accidents.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class RecordForm {
	private int id;
	private Date entryDate;
	private int painLvl;
	private String description;
	private int patientId;
	
	public RecordForm() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy kk:mm")
	public Date getEntryDate() {
		return entryDate;
	}
	
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	@NotNull
	public int getPainLvl() {
		return painLvl;
	}
	
	public void setPainLvl(int painLvl) {
		this.painLvl = painLvl;
	}
	
	@NotNull
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
}
