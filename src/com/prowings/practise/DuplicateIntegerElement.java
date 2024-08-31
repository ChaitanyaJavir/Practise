package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateIntegerElement {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 5, 4, 7, 4, 3, 2, 5);
		
		Set<Integer> duplicateElement = numbers.stream()
					.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
					.entrySet().stream()
					.filter(entry -> entry.getValue() > 1)
					.map(Map.Entry::getKey)
					.collect(Collectors.toSet());
		
		System.out.println("Duplicate Element: " +duplicateElement);
		
	}

}
