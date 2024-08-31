package com.prowings.practise;

public class CharacterCounter {
	
	public static void main(String[] args) {
		String text = "Hey Java Devlopers";
		char character = 'e';
		int count = countCharacterOccurrence(text, character);
		System.out.println("Character occurs time: " + count);
	}
	
	public static int countCharacterOccurrence(String str, char ch) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
					count++;
			}
		}
		
		return count;
	}
	
}
