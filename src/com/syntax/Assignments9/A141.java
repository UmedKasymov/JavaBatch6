package com.syntax.Assignments9;

public class A141 {
	/*In carObject class:
	 * 
	Create instance variables as below.
	model
	price, 
	quantity
	
	Create a constructor that will initialize instance variables. 
	
	Create a method with name carStockValue. Write logic to calculate the total values of 
	cars in stock and print the result. 
	
	run the application in Main Class
	
	Expected Output:
	Toyota 2019 Stock Value 2500000.0
	BMW 2019 Stock Value 652980.0
	
	Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
	 * 
	 */
	
	String model;
	  double price;
	  int quantity;
	  
	  public void A141(String model, double price, int quantity) {
		  
		  this.model=model;
		  this.price=price;
		  this.quantity=quantity;
	  }
	  public void carStockValue(){
		 System.out.println(this.model+" Stock Value "+this.price);
	
	  }
	
	 public static void main(String[] args){
	   A141 car=new A141();
	   car.carStockValue();
	 }
}
