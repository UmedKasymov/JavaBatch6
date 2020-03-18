package com.syntax.class07;

public class ExerciseBoolean {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			System.out.println("I need a day off");
			if(day==6) {
				System.out.println("I do not need a day off any more");
				workDay=false;
			}
			day++;
		}
	}
}
