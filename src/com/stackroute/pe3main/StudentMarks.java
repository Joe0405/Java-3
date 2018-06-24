package com.stackroute.pe3main;

public class StudentMarks {
	
	public String studentMarks(int[] stuGrades) {
		for( int temp : stuGrades) {
			if(!(temp>=0&&temp<=100))
				throw new ArithmeticException("Not a valid grade");
		}
        return "Valid Grades";
    }
	

}
