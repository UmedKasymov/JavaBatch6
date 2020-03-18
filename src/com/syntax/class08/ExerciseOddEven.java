package com.syntax.class08;


public class ExerciseOddEven {

	public static void main(String[] args) {
		// WRITE A PROGRAM TO CALCULATE SUM OF ODDS AND SUM OF EVEN NUMBERS
		//1 TO 99
		//int z=20;
       // while(z<=50) {
        //	if(z%2!=0) {
        	//	System.out.println(z);
        	//}
        	//z++;
	
		int evenSum = 0;
		int oddSum = 0;
		
	    for(int i=1; i<=99;i++) {
	    	if(i%2!=0) {
	    		evenSum=evenSum+i;
	    	}else {
	    		oddSum=oddSum+i;
	    	}
	    }
	    
		System.out.println("Sum of evens = "+evenSum);
		System.out.println("Sum of odds = "+oddSum);
		
	}

}
