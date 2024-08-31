package com.prowings.practise;

import java.util.Arrays;

public class StringToArray {
	
	public static void main(String[] args) {
		String text = "Hello";
		char[] charArray = text.toCharArray();
		System.out.println("Converting String to Array: " +Arrays.toString(charArray));
	}

}
