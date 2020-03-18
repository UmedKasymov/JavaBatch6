package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalImproved {

	public static void main(String[] args) {

		Scanner scan;
		double sales;
		double commission;

		scan = new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales = scan.nextDouble();

		if (sales >= 1 && sales <= 100) {
			// give user 10% commission
			System.out.println("Based on your sales your commission is= " + (sales * 0.10));
		} else if (sales > 100 && sales <= 200) {
			// give user 20% commission
			System.out.println("Based on your sales your commission is= " + (sales * 0.20));
		} else if (sales > 200 && sales <= 500) {
			// give user 30% commission
			System.out.println("Based on your sales your commission is= " + (sales * 0.30));
		} else {
			commission = sales * 0.50;
			System.out.println("Based on your sales your commission is= " + (sales * 0.50));// short way!

			// if commission is >100 -->you are awesome seller
			if (commission > 100) {
				System.out.println("You are awesome seller");
			}
		}

	}
}
