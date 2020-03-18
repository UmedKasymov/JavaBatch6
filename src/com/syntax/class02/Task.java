package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		//exercise 1
		double num1=10.2;
		double num2=3.5;
		
		double sum=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		System.out.println("The adding of 2 numbers "+num1+
				" and " + num2 + "is equal to " + sum);
		System.out.println("The addition of 2 numbers"+num1+
				"and"+ num2 + "is equal to" +(num1+num2));
		//exercise 2
		double s=3.9;
		double s2=s * s;
		
		System.out.println("The square of the " + s + " is " +s2);
		
		//exercise 3
		
		int width = 5;
		int height = 8;
		int area = width * height; //length
		int perimiter=2*(width+height);
		
		System.out.println("The perimeter of a rectangle with width " + 
		width + " and height " + height + " is equal to " + perimiter + 
		" and the area is " +area);
		
	}

}
