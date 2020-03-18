package com.syntax.Assignments5;

import java.util.Scanner;

public class Assignment76 {

	public static void main(String[] args) {
		/*
		 * For you to do:
			Write a program that creates a String array with size 7. 
			Ask the user to input Days of a week beginning with Sunday using Scanner class.
			Add these inputs to your array and then print all values from that array
			
			Example:
			Please enter day 1 of the week
			Sunday
			Please enter day 2 of the week
			Monday
			Please enter day 3 of the week
			Tuesday etc
			==============================
			OUTPUT:
			Please enter day 1 of the week
			Sunday
			Please enter day 2 of the week
			Monday
			Please enter day 3 of the week
			Tuesday
			Please enter day 4 of the week
			Wednesday
			Please enter day 5 of the week
			Thursday
			Please enter day 6 of the week
			Friday
			Please enter day 7 of the week
			Saturday
			Sunday
			Monday
			Tuesday
			Wednesday
			Thursday
			Friday
			Saturday
		 */
		Scanner sc=new Scanner(System.in);
		String[] day=new String[7];
		String userInput;
		for (int i=0;i<=day.length-1;i++) {
			System.out.println("Please enter day "+(i+1)+" of the week");
			userInput=sc.nextLine();
			day[i]=userInput;
		}
		for (String x:day) {
		System.out.println(x);
		
		}
    }
}
