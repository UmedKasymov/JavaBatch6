package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a program that will be asking user to apply for a credit card 10 times.
		 *  As soon you get an “yes” from a user program should stop asking.
		 */
		
		Scanner input=new Scanner(System.in);
		String creditCard=null;
		 for (int i = 1; i <= 10; i++) {
	            System.out.println("Would you like to apply for a credit card");
	            creditCard= input.nextLine();
		
		
		if (creditCard.equalsIgnoreCase("Yes")) {
            System.out.println("Congrats!");
            break;
		}
		
	}
	}
}
