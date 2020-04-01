package com.syntax.Assignments8;

public class A120 {
	/*
	 * Declare static variable in class level as below and assign its value:
	 * 
	 * String ss="Welcome To Syntax Technologies"
	 * 
	 * Access variable in the main method and print it using three ways you learned
	 * so far
	 * 
	 * Hint: first way: By calling directly Second way: By using the className Third
	 * way: By creating the object of the class
	 * 
	 * Expected Output: 
	 * Welcome To Syntax Technologies 
	 * Welcome To Syntax Technologies 
	 * Welcome To Syntax Technologies
	 */

	static String ss="Welcome To Syntax Technologies";
	
	public void displayInfo() {
		System.out.println(ss);
	}
	public static void main(String[] args) {
		A120 obj=new A120();
		System.out.println(ss);
		System.out.println(obj.ss);
		obj.displayInfo();
	}
}
