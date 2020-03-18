package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// create an array and store names of our classes
		
		String[] syntaxClasses= {"SDLC", "Manual testing", "Java","GIT"};
		//Today we have Java Class
		System.out.println("Today we have "+syntaxClasses[2]+" class"); 
	
		double[] numbers= {100.99, 999.99, 90.9};
		// int[] num; // Compiler will give 
		//num={};
		
		int[][] numbers1={{1,3,5,7},{2,4,6,8}};
		
		System.out.println(numbers1[2]);
	}

}
