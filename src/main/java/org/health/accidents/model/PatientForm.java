package org.health.accidents.model;

import java.util.Date;

public class PatientForm {
	private String firstName;
	private String lastName;
	private String accident;
	private Date accidentDate;
	
	public PatientForm() {}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAccident() {
		return accident;
	}
	
	public void setAccident(String accident) {
		this.accident = accident;
	}
	
	public Date getAccidentDate() {
		return accidentDate;
	}
	
	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}
}
