package org.health.accidents.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecordFormTest {
	private RecordForm record = new RecordForm();
	private Date date = new Date(2014, 9, 22);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		record.setDescription("Car accident");
		record.setEntryDate(date);
		date.setHours(3);
		date.setMinutes(20);
		record.setId(1);
		record.setPainLvl(2);
		record.setPatientId(3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId() {
		assertEquals("getId() should return 1", 1, record.getId());
	}

	@Test
	public void testGetEntryDate() {
		assertEquals("getEntryDate() should return 'Thu Oct 22 03:20:00 CEST 3914",
				date, record.getEntryDate());
	}

	@Test
	public void testGetPainLvl() {
		assertEquals("getPainLvl() should return 2", 2, record.getPainLvl());
	}

	@Test
	public void testGetDescription() {
		assertEquals("getDescription() should return 'Car accident'",
				"Car accident", record.getDescription());
	}

	@Test
	public void testGetPatientId() {
		assertEquals("getPatientId() should return 3", 3, record.getPatientId());
	}

}
