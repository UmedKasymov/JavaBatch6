package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment35 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int creditScore;
		String eligibility;
		System.out.println("Do you need a loan?");
		boolean answer = input.nextBoolean();

		if (answer) {
			System.out.println("What is your credit score?");
			creditScore = input.nextInt();
			if (creditScore < 600) {
				eligibility = "Not Eligible";
			} else if (creditScore >= 600 && creditScore <= 700) {
				eligibility = "Maybe eligible";
			} else if (creditScore > 700 && creditScore <= 800) {
				eligibility = "Eligible";
			} else if (creditScore > 800) {
				eligibility = "Definetly eligible";
			} else {
				eligibility = null;
			}
		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility is " + eligibility);
	}
}


