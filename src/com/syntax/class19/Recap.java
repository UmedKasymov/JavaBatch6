package com.syntax.class19;

public class Recap {
// acces. to everyone/access modifier/method with return typ/name/parameter of String array
	//public            static          void                 main(String[] args) {

	Recap(){
		System.out.println("Constructor with nor arguments");
	}
	Recap(int num){
		System.out.println("Constructor with 1 parameter");
	}
	public static void main(String[] args) {//used to execute our methods/codes
		
		Recap obj=new Recap();
		//Recap obj1=new Recap("Hi"); CE: Constructor is undefined
		
	}
}

