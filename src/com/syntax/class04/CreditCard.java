package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) { //type main+ctrl+Space!
		Scanner userInput=new Scanner(System.in);
		System.out.println("Do you use credit card?");
		String answer= userInput.nextLine();
				
		        // boolean answer1=userInput.nextBoolean();
	//  if(answer1){		
		if(answer.contentEquals("Yes")) {
			System.out.println("What is the current balance on your credit card?");
			double c=userInput.nextDouble();
			if(c>=1000) {
				System.out.println("Please pay off your dues immediately");
			}else {
				System.out.println("Please spend more to get higher credit limit");
			}
				
			}else {
				System.out.println("We have a great Credit Card offer for you. Are you interested?");
		}
	}

}
