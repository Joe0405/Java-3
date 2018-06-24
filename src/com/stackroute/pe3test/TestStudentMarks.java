package com.stackroute.pe3test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe3main.StudentMarks;

public class TestStudentMarks {
	StudentMarks studentMarks;

	@Before
	public void setUp() throws Exception {
		studentMarks = new StudentMarks();
	}

	@After
	public void tearDown() throws Exception {
		studentMarks = null;
	}

	@Test
	public void test() {
		String expected = "Valid Grades";
		int[] stuGrade = {10,20,100};
		String actual  = studentMarks.studentMarks(stuGrade);
		assertEquals(expected,actual);
	}

}
