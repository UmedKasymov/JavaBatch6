package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {// FIRST WAY USING "DO WHILE"
		/*
		 * Ask a user to pay for a candy As log as the entered price is not 2 we need
		 * keep ask for playing one amount is correct-->"Enjoy your candy"
		 * 
		 */
		Scanner input = new Scanner(System.in);
		double price;
		do {
			System.out.println("Please pay for the candy");
			price = input.nextDouble();

		} while (price != 2);
		System.out.println("Enjoy your candy");

	}

}
