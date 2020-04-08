package com.syntax.Assignments9;

import com.syntax.class17.StaticKeyword;

public class A131 {

	/*For you to do 
	In main class please declared the variables using different access modifiers that will hold value for:
	name
	city
	name of the school
	batch number
	
	Create a method to display details in following format:
	My name is ___ and I live in ___. I study at ___ in batch ___
	
	Assign values to the variables and execute method display
	
	Expected Output:
	My name is John and I live in Miami. I study at Syntax in batch 6
	 * 
	 */
	static String name, city, nameOfSchool;
	static int batchNumber;
	
	static void displayDetails() {
		System.out.println("My name is "+name+" and I live in  "+city+"."+"I study at "
	+nameOfSchool+" in batch "+batchNumber);
 }
	public static void main(String[] args) {
		A131 obj=new A131();
		obj.name="John";
		obj.city="Miami";
		obj.nameOfSchool="Syntax";
		obj.batchNumber=6;
		displayDetails();
	}
}





