package com.prowings.practise;

public class PrimeNumber {
	public static void main(String[] args) {

		int number = 29;
		boolean isPrime = isPrime(number);
		if (isPrime) {
			System.out.println("Number Is Prime");
		} else {
			System.out.println("Number Is Not Prime");
		}

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
