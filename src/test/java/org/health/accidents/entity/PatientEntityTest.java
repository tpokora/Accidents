package org.health.accidents.entity;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PatientEntityTest {
	private PatientEntity patient;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DAY_OF_MONTH, 22);
		Date date = cal.getTime();
		patient = new PatientEntity("Tommy", "Lee", "Car accident", date);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetFirstName() {
		assertEquals("getFirstName() should return 'Tommy'", "Tommy", patient.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("getLastName() should return 'Lee'", "Lee", patient.getLastName());
	}

	@Test
	public void testGetAccident() {
		assertEquals("getAccident() should return 'Car accident'", "Car accident", patient.getAccident());
	}

	@Test
	public void testGetAccidentDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DAY_OF_MONTH, 22);
		Date date = cal.getTime();
		assertEquals("getAccidentDate() should return 'Thu Oct 22 'current time' CEST 2014'", 
				date, patient.getAccidentDate());
		System.out.println(patient.getAccidentDate().toString());
	}
}
