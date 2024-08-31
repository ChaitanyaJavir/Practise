package com.prowings.example;

import java.util.Scanner;

public class Book 
{
	private int bookId;
	private String bname;
	private String author;
	double price;
	
	public void acceptBookInfo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter book id, name, author, price of book: ");
		
		bookId = sc.nextInt();
		bname = sc.next();
		author = sc.next();
		price = sc.nextDouble();
		
		sc.close();
		
	}
	
		void displayBookInfo()
		{
			System.out.println("Book Id: " +bookId);
			System.out.println("Book name: " +bname);
			System.out.println("Book author: " +author);
			System.out.println("Book price: " +price);
		}
		
		public void updatePrice(double newPrice)
		{
			price = newPrice;
		}

}
