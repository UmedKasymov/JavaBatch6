package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		/*take age input from a user and then based on the age print out
		 *if age from 0-3=you are a baby
		 * if age from 4-5=you are a kid
		 * if age  from 6-12=you are a child
		 * if age from 13-19= you are teenager
		 * if age from 20-64=you are an adult
		 * if age is more or equal to 65=you are a senior
		 */
       //1- let's declare all variables
		
		Scanner input=new Scanner(System.in);//ctrl+shift+O shortcut!
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		//3. perform verification
     if(age>0) {
		if(age<3) {
			System.out.println("You are a baby!");
		}else if(age>=3 && age<=5) {
			System.out.println("You are a kid!");
		}else if(age>=6 && age<=12) {
			System.out.println("You are a child!");
		}else if(age>=13 && age<=19) {
			System.out.println("You are a teenager!");
		}else if(age>=20 && age<65) {
			System.out.println("You are an adult!");
		}else {
			System.out.println("You are enjoying your Life!");
		}
		
	}else {
		System.out.println("Please enter valid age");
	}
}
}
