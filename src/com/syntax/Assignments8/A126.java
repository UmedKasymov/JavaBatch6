package com.syntax.Assignments8;

public class A126 {

	/*
	 * Write a method header on line two with the following specs:  
  
		Returns:
		a String
		
		Name:
		thirdLetter
		
		Parameters:
		a String called s
		
		Then complete the method by programming the following behavior
		Returns every 3rd letter of the String s, 
		starting from the first letter.
		See below examples.
		
		Examples:
		thirdLetter("hello there") ==> "hltr"
		thirdLetter("technology") ==> "thly"
	 */
	static String s;
	
	static String thirdLetter(String s) {
		String thirdLetter="";
		for(int i=0; i<s.length(); i+=3) {
			thirdLetter=thirdLetter+s.charAt(i);
		}
		return thirdLetter;
	}
	public static void main(String[] args){
		String obj = thirdLetter("hello there");
		System.out.println(obj);
	}
}
