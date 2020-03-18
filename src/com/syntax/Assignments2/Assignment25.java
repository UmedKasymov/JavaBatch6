package com.syntax.Assignments2;

import java.util.Scanner;

public class Assignment25 {
	
	public static void main(String[] args) {
	
	Scanner inp=new Scanner(System.in);
	System.out.println("In: ");
	
	int number=inp.nextInt();
	
    if(number>0) {
    	System.out.println(number+ " is positive");
    }else  if(number<0) {
    	System.out.println(number+ " is negative");
    }else {
    	System.out.println("Entered number is equals to "+number);
    	
    }	
	}
}
