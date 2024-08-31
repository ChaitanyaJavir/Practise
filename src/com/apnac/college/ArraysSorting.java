package com.apnac.college;

import java.util.Arrays;

public class ArraysSorting 
{
	public static void main(String[] args) {
		int age = 30;
		int physics = 80;
		int chem = 60;
		int english = 70;
		
		//declaring the array
		int[] marks = new int[3];
		
		//initializing the arrays value 
		marks[0] = 80;
		marks[1] = 60;
		marks[2] = 70;
		
		//sorting of array
		System.out.println("Before sorting arrays: " +marks[0]);
		Arrays.sort(marks);
		System.out.println("After sorting arrays: " +marks[0]);
		
	}

}
