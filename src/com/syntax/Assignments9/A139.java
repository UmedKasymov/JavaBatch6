package com.syntax.Assignments9;

import com.syntax.class19.Dog;

public class A139 {

	/*
	 * 1. Complete the Dog.java class:

		Create following class variables. 
		dogName
		dogWeight   
		static dogBreed=Mutt;
		For all methods and variables use proper naming convention. 
		
		Create constructor to initialize instance variables 
		
		2. In Main class Create 2 Objets of a Dog class and using each object reference 
		variable print details of objects.
		
		Expected Output:
		Tarzan Mutt 50.0
		Lucy Mutt 10.0
	 */
	String dogName;
	double dogWeight;
	static String dogBreed="Mutt";
	
	public void getName(String dogName) {
		System.out.println(dogName+dogBreed+dogWeight);
	}
	public void getWeight(double dogWeight) {
		System.out.println(dogWeight+dogBreed);
	}
	public void printDetails() {
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}
	
	public static void main(String[] args) {
		
		A139 dog=new A139();
		dog.dogName="Tarzan";
		dog.dogBreed="Mutt";
		dog.dogWeight=50;
		dog.printDetails();
	
		A139 dog1=new A139();
		dog1.dogName="Lucy";
		dog1.dogBreed="Mutt";
		dog1.dogWeight=10;
		dog1.printDetails();
	}
}

