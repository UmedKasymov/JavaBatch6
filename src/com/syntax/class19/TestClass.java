package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		Dog dog=new Dog();
		//access variables from own class
		dog.breed="Husky";
		//access variables from parent class
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Big";
		
		//access method from own class
		dog.bark();
		//access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals();
		//can access only features default within it 
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
		Cat cat=new Cat();
		cat.bigEyes=true;
		cat.color="Black";
		cat.size="Small";
		
		cat.play();
		cat.eat();
		cat.sleep();
	}
}
