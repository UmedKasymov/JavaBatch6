package com.syntax.class04;

public class Task {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.3;
		
		if(diploma) {
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligable for Scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You should get a Degree");
		}
	}
}
