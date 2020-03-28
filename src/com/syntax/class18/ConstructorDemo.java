package com.syntax.class18;

public class ConstructorDemo {

	static String str="Hello";
	
	ConstructorDemo(){//non argument constructor(constructor with no parameters)
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	//Note: when you don't create a constructor the compiler will create automatically
	//default constructor which will be non argument constructor
	
	ConstructorDemo(String str){
		System.out.println("I am a construtor with 1 String parameter "+str);
	}
	
	ConstructorDemo(int num){
		System.out.println("I am a constructor with 1 integer value = "+num);
	}
	
	ConstructorDemo(String str, int num){
		System.out.println("I am a construtor with 2 parameters: "+str+" & "+num);
	}
	void ConstructorDemo() {
		 System.out.println("I do not know who am I");
	}
	   
	public static void main(String[] args) {
		
		//ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);
		ConstructorDemo obj=new ConstructorDemo();//ConstructorDemo(){
		ConstructorDemo obj1=new ConstructorDemo("Today is Java Class");//ConstructorDemo(String str){
		ConstructorDemo obj2=new ConstructorDemo(12);
		ConstructorDemo obj3=new ConstructorDemo("Yes", 13);
		ConstructorDemo obj4=new ConstructorDemo();
		obj4.ConstructorDemo();
		
	}
}
