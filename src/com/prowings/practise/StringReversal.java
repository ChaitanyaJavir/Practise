package com.prowings.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReversal {
	
	public static void main(String[] args) {
		String original = "Hello World";
		String reversedString = reversedString(original);
		System.out.println("Original String: " +original);
		System.out.println("Reversed String: " +reversedString);
	}
	
	public static String reversedString(String str) {
		List<String> charList = Arrays.asList(str.split(""));
		
		Collections.reverse(charList);
		
		return String.join("", charList);
		
	}

}
