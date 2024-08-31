package com.prowings.conditional.statment;

import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input From User");
		int ab = sc.nextInt();

		if (ab > 0) {
			System.out.println("Positive Number");
		} else if (ab < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Number is Zero");
		}

	}

}
