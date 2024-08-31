package com.prowings.projects;

import java.util.Scanner;

import com.apnac.college.main;

public class CurrencyConverter {
	private static final double USD_TO_EUR_RATE = 0.83;
	private static final double EUR_TO_USD_RATE = 1.21;

	public static double convert(double amount, String fromCurrency, String toCurrency) {
		double result = 0.0;

		switch (fromCurrency.toUpperCase()) {

		case "USD":
			result = amount * USD_TO_EUR_RATE;
			break;

		case "EUR":
			result = amount * EUR_TO_USD_RATE;
			break;

		default:
			System.out.println("Unsupported Currency: " + fromCurrency);

		}

		switch (toCurrency.toUpperCase()) {
		case "USD":
			result = amount / USD_TO_EUR_RATE;
			break;

		case "EUR":
			result = amount / EUR_TO_USD_RATE;
			break;

		default:
			System.out.println("Unsupported Currency: " + toCurrency);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount");
		double amount = sc.nextDouble();

		System.out.println("Source Currency");
		String fromCurrency = sc.next();

		System.out.println("Target Currency");
		String toCurrency = sc.next();

		double convertedAmount = convert(amount, fromCurrency, toCurrency);
		sc.close();

	}

}
