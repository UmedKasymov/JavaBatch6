package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 * 
		 * 
		 */
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
				System.out.println("Your calculation is " + result);
	}

}
