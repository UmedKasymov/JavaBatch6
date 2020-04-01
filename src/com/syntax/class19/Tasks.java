package com.syntax.class19;

public class Tasks {

	/*
	 * Write program as a Student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student using displayInfo method.
	 * 
	 * 
	 * Write program as a Book class that will have 2 Constructors. While creating
	 * an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 * 
	 */
	String name, address;
	
	public Tasks(String name, String address) {
		this.name=name;
		this.address=address;
		
	}
	public void displayName() {
		System.out.println("Student name is: "+name);
	}
	public void displayAddress() {
		System.out.println("Student address is: "+address);
	}
public void displayInfo() {
		
		displayName();
		displayAddress();
}
	public static void main(String[] args) {
		Tasks obj=new Tasks("John", "555 6th Ave, New Brunswick, NJ 11111");
		obj.displayInfo();
		Tasks obj1=new Tasks("Jane", "4282 Mazarin Pl, Fairfax, VA 22033");
		obj1.displayInfo();
	}
}
