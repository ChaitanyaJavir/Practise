package com.prowings.practise;

public class PrimeNumbers {
	public static void main(String[] args) {
		int number = 29;
		boolean isPrime = isPrime(number);
		System.out.println("IsPrime: " +isPrime);
	}
	
	public static boolean isPrime(int num) {
		if(num <=1)
			return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
			
		}
		
		return true;
		
	}

}
