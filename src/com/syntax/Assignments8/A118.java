package com.syntax.Assignments8;

public class A118 {
	/*
	 * For you to do:
	 * 
	 * Declare 3 instance variables to hold: name of the country capital population
	 * size
	 * 
	 * Create a method to display values of instance variables
	 * 
	 * Create 2 Object, assign values to instance variables, execute method display;
	 * 
	 * Expected Output: 
	 * The capital of USA is Washington DC and population is 330000000 
	 * The capital of Kazakhstan is Astana and population is 18500000
	 */
	String country;
	String capital;
	int population;
	
	void displayInfo() {
		 System.out.println("The capital of "+country+" is "+capital+" and  population is "+population);
	}
	
	public static void main(String[] args) {
		A118 country=new A118();
		country.country="USA";
		country.capital="Washington DC";
		country.population=330000000;
		country.displayInfo();
		
		A118 country1=new A118();
		country1.country="Kazakhstan";
		country1.capital="Astana";
		country1.population=18500000;
		country1.displayInfo();
	}
	
}
