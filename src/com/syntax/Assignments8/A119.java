package com.syntax.Assignments8;

public class A119 {

	/*
	 * For you to do:
	 * 
	 * Declare the instance variables to hold: integer values String values double
	 * values boolean values float values
	 * 
	 * Access instance variables and then print them all without assigning any
	 * values to them. Print variables one by one the same sequence that you declare
	 * them.
	 * 
	 * Expected Output: 
	 * 0 
	 * null 
	 * 0.0 
	 * false 
	 * 0.0
	 */
	int a;
	String b;
	double c;
	boolean d;
	float e;
	
	public void displayInfo() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		A119 obj=new A119();
		obj.displayInfo();
	}
}
