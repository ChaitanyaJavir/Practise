package com.apnac.college;

public class Casting 
{
	public static void main(String[] args) {
		//castings are of two types
		//first implicit casting small data type converting into large
		
		double price = 100.00;
		double finalPrice = price + 18;
		System.out.println("imlicitly casting: " +finalPrice);
		
		//second casting large data converting into small in this we need to explicitly define the type
		int p = 100;
		int fp = p + (int)18.99;//here we explicitly defining data type to convert large in to small
		System.out.println("explicitly casting: " +fp);
		
	}

}
