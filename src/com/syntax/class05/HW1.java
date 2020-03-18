package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner score;
		double quiz;
		double midterm;
		double finalScore;
		String grade;
		double average;
		
		score=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		quiz=score.nextDouble();
		System.out.println("Please enter your midterm score");
		midterm=score.nextDouble();
		System.out.println("Please enter your finalScore");
		finalScore=score.nextDouble();
		average=(quiz+midterm+finalScore)/3;
		if(average>=90) {
			grade="A";
		}else if(average<90 && average>=70) {
			grade="B";
			
		}else if(average<70 && average>=50) {
			grade="C";
		}else {
			grade="F";
		}System.out.println("Your grade is "+grade);
						
	}

}
