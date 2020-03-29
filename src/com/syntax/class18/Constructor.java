package com.syntax.class18;

public class Constructor {

	/*Write a program  that will have 4 different access levels of 
	 * constructors and create 3 objects of this class: 1 - inside 
	 * same class; 2 - from outside the class; 3 - from different class 
	 * inside different package  and observe result.
	 * 
     *Write program that have static constructor and observe result.
	 * 
	 */
	//static Constructor() {//CE: invalid modifier
		
	//} 
	public Constructor() {
		System.out.println("Public Contructor");
	}
	Constructor(int num){
		System.out.println("Default Constructor");
	}
	protected Constructor(int num, int num1) {
		System.out.println("Protected Constructor");
	}
	private Constructor(String str) {
		System.out.println("Private Constructor");
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(12);
		Constructor obj2=new Constructor(12,13);
		Constructor obj3=new Constructor("Syntax");
	}
}
