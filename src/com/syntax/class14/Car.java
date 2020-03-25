package com.syntax.class14;

public class Car {
	
	//define feature of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	
	//define the behavior
	
	void drive() {// all methods are independent 
		System.out.println(make+" can drive");
	}
	void accelarate() {
		System.out.println(make+" can accelarate");
	}

	void makeNoise() {
		System.out.println(make+" can make a noise");
	}
	void stop() {
		System.out.println(make+" stops when you press break");
		System.out.println(" Car stops");
		
	}
	
}






