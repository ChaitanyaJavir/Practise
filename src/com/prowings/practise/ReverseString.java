package com.prowings.practise;

public class ReverseString {

	public static void main(String[] args) {
		
		String original = "Hello Java Developers";
		System.out.println("Orginal String: " +original);
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println("revesed String: " +reversed);

	}

}
