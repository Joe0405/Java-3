package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.RemoveVowels;

public class TestRemoveVowels {
	RemoveVowels removeVowels;

	@Before
	public void setUp() throws Exception {
		removeVowels = new RemoveVowels();
	}

	@After
	public void tearDown() throws Exception {
		removeVowels = null;
	}

	@Test
	public void test() {
		String[] expected = {"Ind","Untd Stts", "Grmny"};
		String[] array = {"India","United States","Germany"};
		String[] actual = removeVowels.removeVowels(array);
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
		assertEquals(expected[2],actual[2]);
		
	}

}
