package com.syntax.class03;

public class PrimitiveCasting {
	//widening, happens implicitly
	public static void main(String[] args) {
		
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99;-->compile time error saying:
		//type mismatch, cannot convert double to int
		
		//Casting in Java is a conversation of one type into another type
		
		//Primitive and Non Primitive Casting
		// 2 Types of casting: 
		//1)Widening(implicit casting, automatically)  
		//2)Narrowing(explicit casting, manually)
	    
		//narrowing, explicitly implementing
		int i=(int)10.99;
		System.out.println(i);
		//byte -128 to 127
		
		byte b=(byte)1284;
		System.out.println(b); 
		
		
	}

}
