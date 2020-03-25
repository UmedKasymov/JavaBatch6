package com.syntax.class16;

public class NotesOfMethods {

	/*
	 * Methods in Java-->block of codes that performs certain action
	 * 
	 * String.length();-->return number of characters from the String 
	 * 
	 * Methods:
	 * 
	 * with parameters 
	 * without parameters
	 * 
	 * Parameters AND Arguments
	 *create a method that will return sum of 2 numbers
	 *
	 * to create a method MUST PART:
	 * return type, give name , no parameters/ parameters
	 * 
	 * ===========================================
	 * public class Recap{
	 * int sum(int a, int b){// header-->parameters
	 *	  return a+b;
	 *  }
	 *  ==============
	 *  void sum1(int a, int b){
	 *  SOPln(a+b);
	 * =============== 
	 * boolean isEqual(int a, int b){
	 * 
	 * 
	 *    }
	 *  }
	 *  public static void main(String[] args){
	 *  
	 *     Recap obj=new Recap();
	 *     obj.sum(10, 12);-->arguments   (arguments should match parameters)
	 *     //after you add 2 numbers now divide sum by 10
	 *     
	 *     int result=sum/10;
	 *==================================     
	 *     int sum1=obj.sum1(1,2);CE:
	 *  }
	 *}
	 *
	 *
	 *Variables in Java;
	 *
	 *variable syntax
	 *
	 *
	 *datatype variableName=value;
	 *
	 *3 Types of Variables in Java:
	 *
	 *   local--variables declared inside the class and inside the method, constructor,
	 *          or block.
	 *          
	 *          void nameInside() {
		
	String name="John";//local variable cause it lives inside the scope of this body.
		               //local variable that visible only within method it was declared.
	}
	
	void anotherName() {
		
		String name="Jane";
	}
	             
	 *   instance--variables declared inside the Class, but outside of the 
	 *             method constructor or block.
	 *             
	 *             Instance Variable are called instance because they belong to instance
	 *             rather than to the class.
	 *             Everytime we create an Object of the class (create and instance of the
	 *             class)every object will get it is own copy of those instance variables.
	 *             
	 *             To access instance variables we need to create an instance of the 
	 *             class (create an Object)
	 *             Any changes we make inside each instance will not affect instance
	 *             variables of another object.
	 *             
	 *             String name, size;
					int age;
				
					void displayDog() {
						System.out.println("Dog name is "+name+"and it "+size+"dog and age is "+age);
				
					}
	 *             
	 *   static--declare inside the class but outside of any method , constructor, 
	 *           or block USING STATIC KEYWORD
	 *           
	 *           static--also called  class variables 
	 *           also static shared with other all instances
	 *
	 *
	 *
	 *
	 */
}
