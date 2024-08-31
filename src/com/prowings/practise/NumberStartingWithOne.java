package com.prowings.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.apnac.college.Array;

public class NumberStartingWithOne {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12, 45, 111, 35, 14, 15, 76, 10);
		
		List<Integer> startWithOne = numbers.stream()
				.map(String::valueOf)
				.filter(s -> s.startsWith("1"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println("Number Starting With One: " +startWithOne);
	}

}
