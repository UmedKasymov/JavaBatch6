package com.syntax.class18;

public class USA {

	//create variables to hold state and capital of the state
	String state, stateCapital;
	
	//create a method to display state and stateCapital
	public void display() {
		System.out.println(state+" and it's capital is "+stateCapital);
	}
	//create a Constructor that will initialize instance variables
	public USA(String state, String stateCapital) {//variables declared  inside Construtor:local variables
		this.state=state;//this-->is used to differentiate your local and instance variable
		this.stateCapital=stateCapital;
		
		//if your instance variable and variable inside constructor are the same name
		//to differentiate them we can use"this".
	}
	public static void main(String[] args) {
		USA usa=new USA("Virginia", "Richmond");
		usa.display();
	}
}
