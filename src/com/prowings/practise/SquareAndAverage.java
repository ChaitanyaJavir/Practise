package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SquareAndAverage {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(20, 4, 25, 50, 60, 30);

		OptionalDouble average = numbers.stream().map(n -> n * n) // Square each number
				.filter(n -> n <= 100) // Filter out numbers greater than 100
				.mapToInt(n -> n) // Convert to an IntStream
				.average();
		
		average.ifPresent(avg -> System.out.println("The average is: " + avg));

	}

}
