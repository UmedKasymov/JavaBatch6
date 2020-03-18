package com.syntax.class08;

import java.util.Scanner;

public class LoopReview2 {

	public static void main(String[] args) {// SECOND WAY USING "WHILE"
		Scanner s = new Scanner(System.in);
		double price;
		System.out.println("Please pay for a candy");
		price = s.nextDouble();

		while (price != 2) {
			System.out.println("Please pay for a candy");
			price = s.nextDouble();
			// if condition if needed
		}
		System.out.println("Enjoy your candy");
	}

}
