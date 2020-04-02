package com.syntax.class21;

public class Addition {//Method Overloading--feature in Java where you can have 2 methods
	//within the same class with the same name.
	
	//with different number parameters

	void add(int num, int num1) {
		System.out.println(num+num1);
	}
	void add(int num, int num1, int num2) {
		System.out.println(num+num1+num2);
    }
	//1st way) to achieve method overloading with adding different number of parameter
	void add(int num, int num1, int num2, int num3) {
		System.out.println(num+num1+num2+num3);
    }
	//2nd way) to achieve method overloading with changing the DataType
	void add(double num1, double num2) {//Note: make sure method signature is different!!!
		System.out.println(num1+num2);
	}
}