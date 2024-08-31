package com.apnac.college;

import java.util.Scanner;

public class ScannerType
{
	
	//how to take input.. by using scanner class
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("your age");
		int age = sc.nextInt();
		System.out.println("age is: " +age);
		
		
	}

}
