package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.FindConsecutiveNumbers;

public class TestFindConsecutiveNumbers {
	FindConsecutiveNumbers findConsecutive;

	@Before
	public void setUp() throws Exception {
		findConsecutive = new FindConsecutiveNumbers();
	}

	@After
	public void tearDown() throws Exception {
		findConsecutive = null;
	}

	@Test
	public void testTrue() {
		boolean expected = true;
		int[] a = {-1,0,1,2};
		boolean actual = findConsecutive.findConsecutiveNumbers(a);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testFalse() {
		boolean expected = true;
		int[] a = {1,2,3,4,6};
		boolean actual = findConsecutive.findConsecutiveNumbers(a);
		assertNotEquals(expected,actual);
	}

}
