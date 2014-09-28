package org.health.accidents.entity;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecordEntityTest {
	private RecordEntity record;
	private Date date;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		date = new Date(2014, 9, 22);
		date.setHours(3);
		date.setMinutes(20);
		record = new RecordEntity(date, 2, "Car accident", 3);
		record.setId(1);
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
