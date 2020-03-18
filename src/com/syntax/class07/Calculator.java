package com.syntax.class07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan;
		char operator;
		double num;
		double num1;
		double result;
		
		scan=new Scanner(System.in);
		System.out.println("==CALCULATOR==");
		System.out.println("Please enter two numbers & an Arithmetic operator");
		System.out.println("==================================================");
		System.out.print("Number 1 :");
		num = scan.nextInt();
		System.out.print("Choose from (+,-, * or /):");
		operator = scan.next().charAt(0); // if its single character we can use "charAt(0)"!
		System.out.print("Number 2 :");
		num1 = scan.nextInt();
		scan.close();
		switch (operator) {
		case '+':
			result = num+num1;
			break;
		case '-':
			result = num-num1;
			break;
		case '*':
			result = num*num1;
			break;
		case '/':
			result = num/num1;
			break;
		default:
			System.out.println("You have entered wrong operator");
			return;
		}
		if(result!=0.0) {
			System.out.println("Your calculation is " + result);
		}
		
	}

}
