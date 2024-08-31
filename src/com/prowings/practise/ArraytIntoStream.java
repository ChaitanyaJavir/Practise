package com.prowings.practise;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraytIntoStream {

	public static void main(String[] args) {
		String[] array = { "apple", "grapes", "mango" };

		// Convert the array to a stream
		Stream<String> stream = Arrays.stream(array);

		// Print each element in the stream
		stream.forEach(System.out::println);
	}

}
