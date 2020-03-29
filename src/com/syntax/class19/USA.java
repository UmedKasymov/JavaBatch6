package com.syntax.class19;

public class USA {
	String state, stateCapital;
	
	public USA(String state, String stateCapital) {
		this.state=state;//compiler uses "this" but we cant see it, uses implicitly
		this.stateCapital=stateCapital;//this--refers to current object
		//after "this" local var. become instance var.
	}

	public void displayState() {
		System.out.println(state);
	}

	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	//can I call a method inside another method?-->YES
	public void displayInfo() {
		
		displayState();//by default compiler add "this" keyword to a method
		displayStateCapital();
		
	}
	//this()-->call CURRENT Constructor
	public static void main(String[] args) {
		
		USA state1=new USA("Texas", "Austin");
		state1.displayState();
		state1.displayStateCapital();
		state1.displayInfo();
		state1=new USA("Georgia", "Atlanta");
		state1.displayInfo();
	}
}
