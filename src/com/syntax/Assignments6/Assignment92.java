package com.syntax.Assignments6;

import java.util.Scanner;

public class Assignment92 {

	public static void main(String[] args) {
		
		
		/*Using Scanner class input string value. 
		Print out the following: "The first 3 letters of ___ is ___"
		
		For example, if the input is "banana", your output should be: 
		"The first 3 letters of banana is ban".
		 * 
		 */
		Scanner input=new Scanner(System.in);
	
		System.out.println("Please enter a word");
		String word=input.nextLine();
		String String=word.substring(0,3);
		System.out.println("The first 3 letters of "+word+" is "+String);
		

	}

}
