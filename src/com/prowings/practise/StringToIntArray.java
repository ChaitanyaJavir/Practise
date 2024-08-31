package com.prowings.practise;

import java.util.Arrays;

public class StringToIntArray {
	public static void main(String[] args) {

		String numberString = "1 2 3 4 5";
		String[] numberStrings = numberString.split(" ");
		int[] numbers = new int[numberStrings.length];
		for (int i = 0; i < numberStrings.length; i++) {
			numbers[i] = Integer.parseInt(numberStrings[i]);
		}

		System.out.println("Integer Array: " + Arrays.toString(numbers));

	}

}
