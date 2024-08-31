package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("a", "f", "e", "a", "e");
		
		List<String> distinctWord = words.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Duplicate Element: " +distinctWord);
	}

}
