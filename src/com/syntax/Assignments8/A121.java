package com.syntax.Assignments8;

import com.syntax.class16.Dog;

public class A121 {
	/*
	 * Declare a static variable number that will hold an integer value:
	 * 
	 * Access number from the main method and assign value to it. Create an Object
	 * of the class, access number in a non static way and assigning value of 200.
	 * 
	 * Print out number using class name and using instance
	 * 
	 * Expected Output: 
	 * 200 
	 * 200
	 */

	static int a;
	
	public static void main(String[] args) {
		A121 obj=new A121();
		a=200;
		System.out.println(obj.a);
		System.out.println(A121.a);
		
	}
}
