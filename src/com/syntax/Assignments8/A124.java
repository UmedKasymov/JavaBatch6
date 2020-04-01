package com.syntax.Assignments8;

public class A124 {

	/*
	 * For you to do:
	 * 
	 * Declare two static variables to hold country name continent
	 * 
	 * Create a method to display the value of static variables in the following
	 * format:
	 * 
	 * ____ located on ____ continent
	 * 
	 * In the main method assign values to a static variable and execute method
	 * display
	 * 
	 * Expected Output: Morocco located on Africa continent
	 * 
	 */
	static String country;
	static String continent;
	
	static void displayInfo() {
		System.out.println(country+" located on "+continent+" continent");
	}
	public static void main(String[] args) {
		A124 obj=new A124();
		obj.country="Morocco";
		obj.continent="Africa";
		obj.displayInfo();
  }
}