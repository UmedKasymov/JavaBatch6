package com.syntax.class25AbstractInterface;

public abstract class Vehicle {

	static int totalVehicles;
	String color;
	
	Vehicle(String color){
		this.color=color;
		totalVehicles++;
	}
	
	public static void total() {
		System.out.println("we build "+totalVehicles);
	}
	
	public void drive() {
		System.out.println("Vehicle drives");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	
	 abstract void start();
	
	 protected abstract void brake();//default-->abstract void brake();
}
class Bus extends Vehicle{
	
	Bus(String color){
		super(color);
	}
	
	public void brake() {
		System.out.println("bus should brake at red light camera");
	}
	void start() {
		System.out.println("Bus can drive fast");
	}
}
abstract class Car extends Vehicle{
	String carType;
	
	Car(String color, String carType){
		super(color);
		this.carType=carType;
	}
	
	public void brake() {
		System.out.println(carType+ " have brakes");
	}
	
}
class Tesla extends Car{
	
	String make;
	
	Tesla(String color, String carType, String make){
		super(color, carType);
		this.make=make;
	}
	
	public void drive() {
		System.out.println(make+" drives on autopilot");
	}

	@Override
	public void start() {
		System.out.println(make+" starts remotely");
	}
	
	public void display() {
		System.out.println("We have "+color+" "+make+" "+carType);
	}
}

class Toyota extends Car{
	
	String make;

	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void start() {
		System.out.println(make+ "starts keyless");
	}	
}
