package com.syntax.class21;

public class AdditionTest {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(10.99,10.99);//Java know which method to pull,w why? cause of datatype
		obj.add(10, 10.99);
		obj.add(10, 10, 10);
	}
}

//Method overloading is a feature that allows a class to have more than one method in the 
//same class only if:
//1. number of parameters are different, 
//2. the type of the data that goes in the parameter are different
//3. or the sequence of the parameters are different.