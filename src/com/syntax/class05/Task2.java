package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * 2.Write a program that will print whether it is a weekend or weekday.
		 * if any day from 1-5 output" It is a weekday"
		 * if any day from6-7 output "It is weekend"
		 * otherwise "invalid day"
		 */
      Scanner scan=new Scanner(System.in);
      System.out.println("Please enter the number of the day");
	  int day=scan.nextInt();
	  
	  if(day>=1 && day<=5) {
		  System.out.println("It is a weekday");
	  }else if(day>=6 && day<=7) {
		  System.out.println("It is a weekend");
	  }else {
		  System.out.println("Invalid day");
	  }
	}

}
