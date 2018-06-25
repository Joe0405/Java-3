package com.stackroute.pe3main;

public class RemoveVowels {
	public String[] removeVowels(String[] remove) {
		String[] removeVowels = new String[remove.length];
		int j=0;
		for(String temp : remove) {
			StringBuilder modified = new StringBuilder(temp);
			for(int i=0;i<modified.length();i++) {
				switch (modified.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					modified.deleteCharAt(i);
					i--;
					break;
				default :
					break;
				}
			}
			removeVowels[j++] = modified.toString();
			
		}
		
		return removeVowels;
	}

}
