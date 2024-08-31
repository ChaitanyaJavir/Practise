package com.prowings.practise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String input = "swiss";
		
		Optional<Character> firstNonRepeated = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst();
		
		if(firstNonRepeated.isPresent())
		{
			System.out.println("First non Repeated character: " +firstNonRepeated.get());
		}else
			System.out.println("No non repeated Element Found");
		
	}

}
