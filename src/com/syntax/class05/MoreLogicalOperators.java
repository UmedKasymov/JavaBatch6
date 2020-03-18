package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*We have total of 7 days in a week
		 * if day is 2,3-->SDLC
		 * if day 6,7-->Java Class
		 * if day 1,5-->Off Day
		 * if day 4---> Review Class
		 */
        
		int day=6;
        // to compare 2 number we use equality operator
		if(day==2 && day==3) {
			System.out.println("Today is SDLC Class");
		}else if(day==6 || day==7) {//||
			System.out.println("Today is Java Class");
		}else if(day==1 && day==5) {
			System.out.println("today is no Class, it is day off");
		}else if(day==4) {
			System.out.println("Today is a review class with Elion");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("------------------Using Strings-----------");
		//To compare String we use equals
		String day1="Saturday";
		
		if(day1.equals("Tuesday") || day1.contentEquals("Wednesday")){
			System.out.println("Today is SDLC Class");
		}else if(day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
			System.out.println("Today is Java Class");
		}
	}

}
