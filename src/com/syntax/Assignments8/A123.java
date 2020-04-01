package com.syntax.Assignments8;

public class A123 {

	/*
	 * For you to do:
	 * 
	 * Create two methods: The first method should be a non-static method that will
	 * print out the following message: "Programming is amazing."
	 * 
	 * The second method should be a static method that will print out the following
	 * message: "Java is awesome."
	 * 
	 * Execute both methods
	 * 
	 * Expected Output: 
	 * Programming is amazing. 
	 * Java is awesome.
	 */
	String s;
	
	void displayInfo() {
		System.out.println("Programming is amazing");
	}
	static void program() {
		System.out.println("Java is awesome");
	}
	public static void main(String[] args) {
		A123 obj=new A123();
		obj.displayInfo();
		program();
	}
}
