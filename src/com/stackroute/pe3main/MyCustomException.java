package com.stackroute.pe3main;

public class MyCustomException extends Exception {
	private String argument;
	
	public MyCustomException(String argument) {
		super();
		this.argument = argument;
	}


	public String getMessage() {
		return argument;
	}


	public void setArgument(String argument) {
		this.argument = argument;
	}


	public static void main(String[] args) {
		MyCustomException customException = new MyCustomException("This is my Exception");
		try {
			System.out.println("You're about to see something exceptional");
			throw customException;
		} catch (MyCustomException e) {
			System.out.println("This is it: "+ e.getMessage());
		} finally {
			System.out.println("Yeah I'm getting executed no matter what!");
		}

	}

}
