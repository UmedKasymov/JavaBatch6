package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		//declare date and a day.
		// if day is Friday-->if date is 13-->watch scary movie
		// if a day is Friday-->if date is not 13-->watch a comedy

		boolean isFriday=true;
		int date=14;
		
		if(isFriday) {
		    System.out.println("Today is Friday, I am going to a movie");
		    if(date==13) {
		    	System.out.println("I will watch a scary movie");
		    }else {
		    	System.out.println("I will watch a comedy");
		    }
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
		
	}

}
