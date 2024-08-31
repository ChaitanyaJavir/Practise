package com.prowings.practise;

import java.util.Arrays;

public class StringToWordsArray {
	public static void main(String[] args) {
		String sentence = "Java is Object Oriented Programing Laguage";
		String[] words = sentence.split(" ");
		System.out.println("Converting String to Word Array: " +Arrays.toString(words));
	}

}
