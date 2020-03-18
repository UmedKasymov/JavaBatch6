package com.syntax.class07;

import java.util.Scanner;

public class TaskLottery {

	public static void main(String[] args) {
		//we are playing a lottery and lucky number is 17;
		//we want to keep asking user any number from 1-20
		//until he guess the lucky number-->Congrats!
		
		Scanner input;
		int num = 0;
		int luckyNumber=17;
		input=new Scanner(System.in);
		
		do{
			System.out.println("Please enter a number between 1-20");
			num=input.nextInt();
			
			if(num>20 || num<1) {
				System.out.println("Please enter valid number");
			}
		}while(num!=luckyNumber);
				
			System.out.println("You got it!!!!!");
			
	}
		
	}

