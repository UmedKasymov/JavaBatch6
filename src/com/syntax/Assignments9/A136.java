package com.syntax.Assignments9;

import com.syntax.class18.Constructor;

public class A136 {

	/*1. Complete the SyntaxTechnologies class:

		Include the following class variables:
		* schoolName(String)
		* batch(int)
		* year(int)
		* lastDayOfClass(String)

		Write two constructors:
		* non-argument constructor
		* parameterized constructor

		Create method to display values of instance variables.

		2. In Main Class:
		Create two different objects of the SyntaxTechnologies class using both constructors 
		and call display method.

		Expected Output:
		null 0 0 null
		Syntax 6 2020 07/30/2020
		*/
	String schoolName, lastDayOfClass;
	int batch, year;
	
	A136(){
		System.out.println("");
	}
	A136(String schoolName, int batch, int year, String lastDayOfClass){
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
    public void displayMethod() {
		
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
        
   }
	
	public static void main(String[] args) {
		A136 obj=new A136();
		obj.displayMethod();
	    A136 obj1=new A136("Syntax",6,2020,"07/30/2020");
		
	}
}
