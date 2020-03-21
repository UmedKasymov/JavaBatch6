package com.syntax.Assignments6;

import java.util.Scanner;

public class Assignment96 {

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
			String s;
			
			Write a for loop that will print out the reverse of the string.
			
			Sample input/outputs:
			In: manhattan
			nattahnam
			
			In: processor
			rossecorp
			
			In: racecar
			racecar
					 */
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
		String reversed = "";
		for(int i=s.length()-1; i>=0; i--) {
			reversed=reversed+s.charAt(i);
		}
		System.out.println(reversed);
		
	}

}
