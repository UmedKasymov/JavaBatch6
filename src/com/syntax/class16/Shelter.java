package com.syntax.class16;

public class Shelter {

	public static void main(String[] args) {
		
		//access instance variables
		Dog puppy=new Dog();
		puppy.name="Charlie";
		System.out.println(puppy.name);
		
		//access static variables of different class 
		System.out.println(Dog.breed);//static variable by its name(Dog.breed);
		                  //tell which class"Dog" this variable "breed" belongs
		
	}
}
