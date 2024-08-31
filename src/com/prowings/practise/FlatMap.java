package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		
		List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h")
        );
		
		List<String> flatendMap = listOfLists.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println("Flat Map: " +flatendMap);
	}
	

}
