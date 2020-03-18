package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the loan amount ");
		
		int num=input.nextInt();
		
		if(num<=200000) {
			System.out.println("The loan amount  will be lended");
		}else {
			System.out.println("You are rejected");
		}
		
		
	}
}
