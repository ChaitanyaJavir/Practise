package com.apnac.college;

public class StringOperationAndMethods {
	public static void main(String[] args) {
		/// String concatenation example

		String name1 = "sunita";
		String name2 = "Tribhuvan";
		String name3 = name1 + name2;
		System.out.println("Print the names: " + name3);

		String name4 = name1 + " and " + name2;
		System.out.println("Printing name in a better formate: " + name4);

		// concatenation joins the two words

		/// charAt example
		String name = "Sunita";

		// charAt function define the position of character and we also pass the index
		// no to know the position
		System.out.println("In which position does the character are stored: " + name.charAt(0));

		// by length we can get the length of the given variable(name)
		System.out.println("Length of the name: " + name.length());
		
		//replace the character by replace() method..this method replaces the given charachter
		String na = "hello";
		String na2 = na.replace('o', 'i');
		System.out.println("Replace the given character: " +na2);
		
	}

}
