package com.stackroute.pe3main;

public class FindConsecutiveNumbers {
	public boolean findConsecutiveNumbers(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			if(!(((a[i]-a[i+1])==-1)||((a[i]-a[i+1])==1))) {
				return false;
			}
		}
		return true;
	}

}
