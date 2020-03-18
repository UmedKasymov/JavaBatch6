package com.syntax.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age ");
		
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("You will be issued a Drivers License!");
		}else {
			System.out.println("You will be issued a Learners Permit!");
		}

	}

}
