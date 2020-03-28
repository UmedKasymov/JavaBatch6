package com.syntax.Assignments7;

public class Assignment102 {

		  String car;
			String Color;
			 String Make;
			 int Year;
			  void car(String Make,String Color,int Year) {
					System.out.println("Car color is "+Color+ "and car year is" +Year+" and car model is"+ Make);
			  }
			public static void main(String[] args){	
				Assignment102 car=new Assignment102();
				car.Make="BMW";
				car.Color="Black";
				car.Year=2019;
				System.out.println("Car color is "+car.Color+ " and car year is " +car.Year+" and car model is "+ car.Make);
				car.Color="White";
				car.Year=2018;
				car.Make="Toyota";
					System.out.println("Car color is "+car.Color+ " and car year is " +car.Year+" and car model is "+ car.Make);
				}

}
