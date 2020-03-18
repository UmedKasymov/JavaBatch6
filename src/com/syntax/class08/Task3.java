package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point), provided by a user and 
		 * then FROM THAT RANGE prints the sum of the even and odd integers.
		 * 
		 */
		Scanner input=new Scanner(System.in);
		int evenTotal = 0;
		int oddTotal = 0;
		
		
		System.out.println("Please enter two numbers: ");
		int min=input.nextInt();//10
		int max=input.nextInt();//20
		
		
	    for(int i=min; i<=max;i++) {
	    	if(i%2==0) {
	    		evenTotal=evenTotal+i;
	    	}else {
	    		oddTotal=oddTotal+i;
	    	}
	    }
	    
		System.out.println("The total of even numbers between "+min+" to "+max+" is "+evenTotal);
		System.out.println("The total of odd numbers between "+min+" to "+max+" is "+oddTotal);
	}

}
