package com.syntax.class19;

public class ConstructorCall {
	
	public ConstructorCall() {
		System.out.println("I am non argument Constructor");
	}
	
	public ConstructorCall(String str) {
		this();//calling constructor inside the constructor
	}

	public ConstructorCall(String str, String str1) {
		//this("Hello");//line 9(public ConstructorCall(String str) {)
		//this("hi", "hello");
		//this(12); cause it can NOT call itself
		this(str);
	}
	
	
	public static void main(String[] args) {
		// creating an object by passing 2 String values
		ConstructorCall onj=new ConstructorCall("Java", "Love");
	}
}
