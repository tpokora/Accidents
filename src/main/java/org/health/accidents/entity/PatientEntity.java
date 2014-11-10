package org.health.accidents.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQuery(
		name = "findPatientById",
		query = "FROM PatientEntity WHERE id = :id")
@Entity
@Table(name = "patient")
public class PatientEntity {
	private int id;
	private String firstName;
	private String lastName;
	private String accident;
	private Date accidentDate;
	private Set<RecordEntity> records;
	
	public PatientEntity() {}
	
	public PatientEntity(String firstName, String lastName,
			String accident, Date accidentDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accident = accident;
		this.accidentDate = accidentDate;
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
	
	@Column(name = "firstName")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "lastName")
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "accident")
	public String getAccident() {
		return accident;
	}
	
	public void setAccident(String accident) {
		this.accident = accident;
	}
	
	@Column(name = "accidentDate")
	public Date getAccidentDate() {
		return accidentDate;
	}
	
	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}
	
	@OneToMany
	public Set<RecordEntity> getRecords() {
		return records;
	}
	
	public void setRecords(Set<RecordEntity> records) {
		this.records = records;
	}

}
