package com.prowings.conditional.statment;

import java.util.Scanner;

public class WeekdayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input Number as per Day");
		int day = sc.nextInt();

		System.out.println(getDayName(day));

	}

	private static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednsday";
			break;
		case 4:
			dayName = " Thrusday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day Range";

		}
		return dayName;
	}

}
