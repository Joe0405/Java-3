package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.GenerateExceptions;

public class TestGenerateExceptions {
	GenerateExceptions exceptions;

	@Before
	public void setUp() throws Exception {
		exceptions = new GenerateExceptions();
	}

	@After
	public void tearDown() throws Exception {
		exceptions = null;
	}

	@Test(expected = NegativeArraySizeException.class)
	public void test() {
		exceptions.generateExceptions();
	}

}
