package com.syntax.class08;

public class BreakAndCoontinue {
	
	public static void main(String[] args) {
		// break keyword: can be used inside any loop
		//it breaks the loop[(as soon as code reaches break...
		//
		//
		// once i=4--. WE WANT TO STOP THE LOOP
		
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("I am stopping loop");
				break;//  simply it breaks the LOOP!
			}
			System.out.println("I am inside the loop");
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		
		for(int y=1; y<=10; y++) {
			if(y==4) {
				System.out.println("I am skipping iteration");
				continue;// to skip iteration!
			}
			System.out.println("I am inside the loops");//when y==4 its skipped
			System.out.println(y);
		}
	
	}

}
