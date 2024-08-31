package com.apnac.college;

import java.util.Arrays;

public class ArraysDimession 
{
	public static void main(String[] args) {
		
		//if know the arrays size then you can declare array directly
		int[] marks = {80,60,70};
		
		//two dimension arrays means you can declare to 2 types of values (2 students marks you can declare)
		int[][] finalMarks = {{80, 60, 70}, {80, 90, 50}};
		//passing the index to print the value
		System.out.println("finalMarks: " +finalMarks[1][1]);
	}

}
