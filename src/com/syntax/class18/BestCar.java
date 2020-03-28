package com.syntax.class18;

public class BestCar {
	

	String make, model, color;
	int year, door , wheels;
	
	public void printDetails() {
		
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
        System.out.println(make+" has "+door+" door and "+wheels+" wheels");
  }
	BestCar(String carMake, String carModel, String carColor, int carYear, int carDoor, 
			int carWheels){
		make=carMake;//BMW
		model=carModel;//M5
		color=carColor;//Grey
		year=carYear;//2020
		door=carDoor;//4
		wheels=carWheels;//5
	}
	public static void main(String[] args) {
		//once we create our own constructor compiler WILL NOT  be creating a 
		//default constructor for you!
		//BestCar car= new BestCar();CE:
		BestCar car=new BestCar("BMW", "m5", "Grey", 2020, 4, 5);
		//car.make="BMW";
		car.printDetails();
		//new BestCar("Toyota", "Camry", 2020, 2, 4, "Blue");CE:swap arguments
	}
}






