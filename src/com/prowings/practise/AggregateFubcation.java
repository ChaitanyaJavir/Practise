package com.prowings.practise;

import java.util.Arrays;
import java.util.List;

public class AggregateFubcation {
	
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		
		int sum = number.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("Aggregate of Sum: " +sum);
	}

}