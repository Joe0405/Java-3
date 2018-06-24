package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.CalculateDate;

public class TestCalculateDate {
	CalculateDate day;

	@Before
	public void setUp() throws Exception {
		day = new CalculateDate();
	}

	@After
	public void tearDown() throws Exception {
		day = null;
	}

	@Test
	public void test() {
		String[] expected = {"Mon, 25/06/2018","Sun, 01/07/2018"};
		String[] actual = day.calculateDate();
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[0],actual[0]);
	}

}
