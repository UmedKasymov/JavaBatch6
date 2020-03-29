package com.syntax.class19;

public class Constructors {//from Bottom to Top for a print out:
	
	//Note: While using Debug, do step over: when you do not insert the line of code
	//: do step into when you write  a line of code yourself
	
	Constructors(){
		this(1);
		System.out.println("Hi");
	}
	Constructors(int x){
		this(1,2);
		System.out.println("Hello");
	}
	Constructors(int x, int y){
		System.out.println("How are you?");
	}
	
	public static void main(String[] args) {
		Constructors obj=new Constructors(1,2);
		
	}
}
