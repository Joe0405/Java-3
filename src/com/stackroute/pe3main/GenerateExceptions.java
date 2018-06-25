package com.stackroute.pe3main;

import java.security.PublicKey;

public class GenerateExceptions {
	public void generateExceptions() {
		try {
			int[] array = new int[-2];
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());;
		}
		
		try {
			int[] array = new int[2];
			array[3] =  0;
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String[] string = null;
			string[0] = "I'm Null";
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
