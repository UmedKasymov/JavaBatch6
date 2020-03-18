package com.syntax.class02;

public class ModulusOperations {

	public static void main(String[] args) {
		
		float f=12.50f;
		float f1=2.7f;
		
		double d=12.50;
		double d1=2.7;
		
		float result=f/f1;
		double result3=d/d1;
		
		System.out.println(result);
		System.out.println(result3);
		
		int i=12;
		int y=7;
		
		int result1=i/y;
		double result2=i/y;  // didn't get this part ???
		
		System.out.println(result1);
		System.out.println(result2); // didn't get this part???
		
		//modulus
		
		int v=16;
		int w=7;
		
	    int mod=v%w; // to see modulus operator
		System.out.println(mod); //will give you the result of remainder
		
		//I would like to divide 12/7
		
		//int num1=12.5; not possible to store decimals into int
		
		double num2=12;// we can store int into double
		double num3=7;
		
		System.out.println(num2/num3);
		
		
	}

}
