package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.*;

public class TestAddMatrices {
	AddMatrices addMatrices;

	@Before
	public void setUp() throws Exception {
		addMatrices = new AddMatrices();
	}

	@After
	public void tearDown() throws Exception {
		addMatrices = null;
	}

	@Test
	public void test() {
		int[][] expected = {{10,10},{10,10},{10,10}};
		int[][] matrixA = {{1,2},{3,4},{5,6}};
		int[][] matrixB = {{9,8},{7,6},{5,4}};
		int[][] actual = addMatrices.addMatrices(matrixA, matrixB, 3, 2);
		assertArrayEquals(expected,actual);
	}

}
