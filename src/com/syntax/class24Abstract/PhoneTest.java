package com.syntax.class24Abstract;

public class PhoneTest {

	public static void main(String[] args) {
		
	//new Phone();CE:cannot instantiate/create an object of Phone class because its ABSTRACT
	
		Phone iphone=new iPhone();//upcasting 
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		Phone samsung=new Samsung();//Phone Samsung=new Samsung();-->possible as well!
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
	}
}
//why ABSTRACT class has to participate in inheritance?

//how much possible it would be if we didn't had any inheritance?
//Wouldn't be able to create objects
//it would be pointless
//abstract=has to use inheritance(parent and child class)