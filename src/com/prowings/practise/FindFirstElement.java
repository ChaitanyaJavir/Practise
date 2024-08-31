package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList( 10, 20, 40, 50, 70);
		
		Optional<Integer> firstElement = numbers.stream()
				.findFirst();
		
		if(firstElement.isPresent())
		{
			System.out.println("The First Element is Present");
		}else
		{
			System.out.println("First Element is Not Present");
		}
	}

}
