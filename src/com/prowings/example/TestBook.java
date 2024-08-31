package com.prowings.example;

public class TestBook 
{
	public static void main(String[] args) {
		{
			System.out.println("Jai Shriram!!");
			
		Book	b1 = new Book();
				b1.acceptBookInfo();
				b1.displayBookInfo();
				
				///Update the price of Book
				b1.updatePrice(200.30);
				
				System.out.println("After Modification");
				b1.displayBookInfo();
		}
	}

}
