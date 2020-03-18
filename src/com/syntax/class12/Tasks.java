package com.syntax.class12;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).


			Create a String and if the String is not empty perform the following: 
			if the String has an odd number of characters and has 3 or more characters, 
			print the character in the middle of the String.
			=======================================================
			Write a program that reads two people’s first names and if they expecting boy or girl?
			Based on the input suggests a name for a baby:
			
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY
			
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
		 */

		String str="Sundays";
		String backwords = "";
		char letter=str.charAt(3);
        System.out.println(letter);
			for (int i = str.length() - 1; i >= 0; i--) {
			backwords = backwords + str.charAt(i);
			
		}
		System.out.print("Name in backwords:");
		System.out.println(backwords);
	}
}




