package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxElementInList {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		Optional<Integer> maxElement = numbers.stream()
				.max(Integer::compareTo);
		if(maxElement.isPresent())
		{
			System.out.println("Max Number of Given List is: " +maxElement.get());
		}else {
			System.out.println("The List is Empty");
		}
	}
}
