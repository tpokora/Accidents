package org.health.accidents.entity;

import static org.junit.Assert.*;

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
		patient = new PatientEntity("Tommy", "Lee", "Car accident", 
				new Date(2014, 9, 22));
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
		Date date = new Date(2014, 9, 22);
		assertEquals("getAccidentDate() should return 'Thu Oct 22 00:00:00 CEST 3914'", 
				date, patient.getAccidentDate());
	}
}
