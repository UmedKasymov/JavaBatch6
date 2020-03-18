package com.syntax.class10;

public class Tasks {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. using 2 different loops print all 
		//elements from the array
		
		String[] animals = { "Dog", "Cat", "Cow", "Horse", "Mouse", "Tiger" };
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("=======================");

		// 2nd loop
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		
	}
		//Create an array on integers and calculate the sum of all integer elements in an array.
	    int[] numbers = {1,2,3,4,5,6};
	    int sum=0;
	    
	    for(int i: numbers) {
	    	sum+=i;
		
}
	    System.out.println("The sum of the numbers in this array is :"+sum);
	    System.out.println("==============Using another loop=============");

		//Create an array of countries. While retrieving all values from an array print capital 
		//for each country.Using 2 different loops.

        
	  String[] countries = { "Tajikistan", "USA", "Hungary", "Belgium" };
      for (String country:countries) {
    	  if(country.contentEquals("USA")) {
    		  System.out.println("The capital of "+country+" is Washington");
    	  }else if(country.equals("Tajikistan")) {
    		  System.out.println("The capital of "+country+" is Dushanbe");
       	  }else if(country.equals("Hungary")) {
       		  System.out.println("The capital of "+country+" is Budapest");
       	  }else { 
       		capital="unknown";
			}
			System.out.println("The capital of "+name+" is "+capital+" ." );
       	  }
   }
 }
}