package com.syntax.Assignments7;

public class Assignment102 {

		  String carColor;
		  int carYear;
		  String carMake;


public static void main(String[] arg){
		    
		    Assignment102 vehicle1=new Assignment102();
		    
		  vehicle1.carColor="Black";
		  vehicle1.carYear=2019;
		  vehicle1.carMake="BMW";
		  
		  Assignment102 vehicle2=new Assignment102();
		  vehicle2.carColor="White";
		  vehicle2.carYear=2018;
		  vehicle2.carMake="Toyota";
		  
		  System.out.println("Car color is "+vehicle1.carColor+" and car year is "+
		  vehicle1.carYear+" and car model is "+vehicle1.carMake);
		  System.out.println("Car color is "+vehicle2.carColor+" and car year is "+
				  vehicle2.carYear+" and car model is "+vehicle2.carMake);
		  
		  }
	}


