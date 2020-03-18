package com.syntax.class08;

public class ForLoopMostPopular {

	public static void main(String[] args) {
		// FOR-->when we know in advance how many times we want to repeat block of code
		// for(initialization; condition; increment)
		//
		//
		//
		//
		// TO PRINT NUMBER FROM 50 TO 1
		for(int i=50; i>=1; i--) {
			System.out.println(i);
		}
		//PRINT ODD NUMBERS BETWEEN 20 TO 50
		// 1 way
	    System.out.println("==============PRINT ODD NUMBERS===================");

	    for(int i=20; i<=50; i++) {
	    	if(i%2!=0) {
	    		System.out.println(i);
	    	}
	    }
	    System.out.println("==============PRINT ODD NUMBERS===================");
	    // 2 way
	    for(int i=21; i<=50; i+=2) {
	    	System.out.println(i);
	    }
	    // WHAT IS OUPUT
	    int total=2;
	    for(int k=1; k<4; k++) {
	    	total=total*k;
	    }
	    System.out.println("Final Total "+total);
	}

}
