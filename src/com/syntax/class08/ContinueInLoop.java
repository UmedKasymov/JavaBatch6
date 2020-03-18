package com.syntax.class08;

public class ContinueInLoop {

	public static void main(String[] args) {
		// write a program that print numbers from 1 to 20 
		//I do not want to print 5,6,7!
		
		for(int i=1; i<21; i++) {
			if(i==5 || i==6 || i==7) {// USING && CAN GIVE YOU AN ERROR, CAUSE ALL CONDITION CAN NOT BE TRUE
				continue;             // AT THE SAME TIME, SO WE HAVE TO USE "||"(OR) SIGN!
			}
			System.out.println(i);
		}
			
		int i;
	for(i=1; i<=100; i++) {
		
		if(i>=35 && i<=55) {
			continue;
		}
		System.out.println(i);
	}
	}
}
