package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		
		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Ble";
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2019;
		car2.color="Pink";

		Car car3=new Car();
		car3.make="123";//if we put 123 the compiler will give an error cause it goes by the template you have
		              // created
		car3.speed=200;
		
		//print BMW
		System.out.println(car2.make);
		//accessing behavior/methods of the Car with Class
		car1.drive();
		car1.accelarate();
		car1.makeNoise();
		car1.stop();
		
		//accessing behavior/methods of the Car with Class
	    car2.drive();
		car2.accelarate();
		car2.makeNoise();
		car2.stop();
		
		// I drive pink BMW
		System.out.println("I drive "+car2.color+" "+car2.make);
		
		//create bike object
		// new Bike(); we can not create object  if we do not have Class
		
	}

}
