package com.prowings.conditional.statment;

import java.util.Scanner;

public class GreatestNumber 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number");
		int a = sc.nextInt();
		
		System.out.println("Second Number");
		int b = sc.nextInt();
		
		System.out.println("Third Number");
		int c = sc.nextInt();
		
		if (a > b)
			   if (a > c)
			    System.out.println("The greatest: " + a);
			   
			  if (b > a)
			   if (b > c)
			    System.out.println("The greatest: " + b);
			   
			  if (c > a)
			   if (c > b)
			    System.out.println("The greatest: " + c);
	}

}
