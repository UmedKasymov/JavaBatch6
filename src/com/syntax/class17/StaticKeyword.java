package com.syntax.class17;

public class StaticKeyword {

	//create a template for a Phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//return type, give name , no parameters/ parameters
	static void displayGeneralInfo() {//instance method, cause does not have any STATIC keyword
		System.out.println("We are biuilding "+brand+" with touchscreen "+touchScreen);
	}
	void displaySpecifications() {
		System.out.println("We build phone with  "+memory+" GB memory in "+color+" color");
	}
	public static void main(String[] args) {
		brand="iPhone";
		touchScreen=true;//accessing in static way
		
		StaticKeyword obj=new StaticKeyword();
		obj.color="grey";
		obj.memory=64;//instance variable
		//accessing static method in a static way
		displayGeneralInfo();//once you add "static" word before void
		displaySpecifications();
		
		
	}
}
