package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		// if (boolean expression){
		//  code....
		
		     // If (boolean expression){
		     // code...
	         // }
		//}
		// Nested If is ....if condition inside the if condition
//____________________________________________________________________
		
		boolean flag=true;
		boolean classToday=false;
		
		if(flag) {//first door(main door)
			System.out.println("Hello");
			
			if(classToday) {
				System.out.println("Hello friends");
			}else {
				System.out.println("Hello Family");
			}
			
		}else {
			System.out.println("Bye");
		}
	System.out.println("I am outside of if condition");
	}
	

}
