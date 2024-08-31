package com.prowings.practise;

import java.util.Arrays;
import java.util.List;

public class LongElementInList {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
		
		long count = number.stream()
				.count();
		System.out.println("Count Of Given Element List: " +count);
	}

}
