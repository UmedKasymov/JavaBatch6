package com.syntax.Assignments9;

public class A137 {

  
String make, model;
int numberOfDoors, topSpeed;
double price;

	A137(String make, String model, int numberOfDoors, int topSpeed, double price){
	  System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	//A137(String make, String model, int topSpeed, double price){
	
	 // System.out.println(make+" "+model+" "+" 4 "+topSpeed+" "+price);
	//}
	//A137(int numberOfDoors, int topSpeed, double price){
	
	//System.out.println("unknow"+" uknown "+numberOfDoors+" "+topSpeed+" "+price);
	//}
	//A137(String make, String model, int numberOfDoors){
	  //System.out.println(make+" "+model+" "+numberOfDoors+" "+"90"+" "+"0");
	//}
	public void displayMethod(){
	  System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	 }
	
	public static void main(String[] args) {
		A137 obj=new A137("Toyota","Prius", 4, 120,30000.0);
		obj.displayMethod();
		A137 obj2=new A137("unknown","uknown", 4, 120,30000.0);
		A137 obj3=new A137("Toyota","Prius", 4, 90,0);
		
	}
}

