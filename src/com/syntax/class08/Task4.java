package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off the amount. If user give more money program
		 * should return a change. Whenever a user done with payments program should say
		 * “Thank you for shopping!”
		 */
		Scanner scan;
		String item;
		double price;
		double money = 0;
		double amount = 0;
		double change;
		double remainingbalance;
		scan = new Scanner(System.in);
		System.out.println("What are you buying today?");
		item = scan.nextLine();

		System.out.println("What is the price for the " + item);
		price = scan.nextDouble();

		do {
			System.out.println("Please make a payment");
			money = scan.nextDouble();
			amount = amount + money;

			if (amount < price) {
				remainingbalance = price - amount;
				System.out.println("Please give more " + remainingbalance);
			} else if (amount > price) {
				change = amount - price;
				System.out.println("Here is your chanage " + change);
				break;
			//} else {
			//	System.out.println("You made a full payment");
			}

		} while (price != amount);

		System.out.println("Thank you for shopping!");
	}

}
