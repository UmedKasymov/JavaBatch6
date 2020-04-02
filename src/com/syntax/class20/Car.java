package com.syntax.class20;

public class Car {
	String make, model;
	public Car() {
		System.out.println("I am a Parent class constructor");
	}
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
}

class Mercedes extends Car{//Constructor can not be inherited cause it should
	//have the same name as Class Name. Child class it will have its own Constructor.
	
	String sportModel;
	
	public Mercedes(){
		
		//super();//compiler add super() by default
		System.out.println("I am Child class contructor");
		//compiler gonna make a super call
		//compiler needs to initialize object
	
	}
	public Mercedes(String make, String model,String sportModel) {
		//super("Mercedes","C63");
		this.sportModel=sportModel;
	}
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel);
	}
}