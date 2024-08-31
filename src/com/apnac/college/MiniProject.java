package com.apnac.college;

import java.util.Scanner;

public class MiniProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100);
		int userNumber = 0;
		
		do 
		{
			System.out.println("Guess My Number");
			userNumber = sc.nextInt();
			
			if(userNumber == myNumber)
			{
				System.out.println("WHOHOO..CORRECT NUMBER!!");
				break;
			}
			
			else if(userNumber > myNumber)
			{
				System.out.println("Your number is too Large!!");
			}
			else {
				System.out.println("Your number is too Small!!");
			}
		}
			while(userNumber >= 0);
			System.out.println("My Number was: ");
			System.out.println(myNumber);
		}
		
	}


