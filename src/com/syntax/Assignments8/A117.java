package com.syntax.Assignments8;

public class A117 {
	/*
	 * For you to do: declare 3 instance variables to hold an integer, double and
	 * char values.
	 * 
	 * Create 2 instances of the class and assign values to variables and the print
	 * them
	 * 
	 * Expected Output: 10 10.23 a 100 100.23 s
	 * 
	 */

	 int a;
	 double b;
	 char c;
	
	public void age(int a) {
		System.out.println(a);
		
	}
	public void price(double b) {
		System.out.println(b);
	}
	public void character(char c) {
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		A117 obj=new A117();
		obj.age(10);
		obj.price(10.23);
		obj.character('a');
		
		A117 obj1=new A117();
		obj.age(100);
		obj.price(100.23);
		obj.character('s');
	}
}
