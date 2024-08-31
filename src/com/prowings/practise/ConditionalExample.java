package com.prowings.practise;

public class ConditionalExample {
	public static void main(String[] args) {
		 
		int number = 10;
		if(number > 0) {
			System.out.println("The Number is Positive");
		}else if(number < 0){
			System.out.println("The Number is Negative");
		}else {
			System.err.println("The Number is Zero");
		}
		
	}

}
