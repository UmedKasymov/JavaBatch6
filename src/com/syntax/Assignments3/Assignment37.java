package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean thirsty;
		boolean sleepy;
		System.out.println("Are you thirsty?");
		thirsty = input.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = input.nextBoolean();
		String result;

		if (thirsty && (!sleepy)) {
			result = "Water";
		} else if (thirsty && sleepy) {
			result = "Coffee";
		} else if ((!thirsty) && sleepy) {
			result = "Tea";

		} else {
			result = "Nothing";
		}

		System.out.println("Looks like you need to drink " + result);

	}
}