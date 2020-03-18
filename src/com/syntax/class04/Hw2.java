package com.syntax.class04;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("How long you are working with the company?");
	    int year=userInput.nextInt();
		
		System.out.println("What is your Annual Salary");
		double salary=userInput.nextDouble();
			
		if(year>=5) {
			System.out.println("Your are eligible for Bonus!!");
		
		if (salary>=50000) {
			System.out.println("Your bonus amount is 5000");
				
		}else {
			System.out.println("Your bonus amount is 3000");
		}
	
	}else {
		System.out.println("Sorry, You are not eligible for Bonus until you reach 5 years");
	}
}
}
