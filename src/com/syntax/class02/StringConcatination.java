package com.syntax.class02;

public class StringConcatination {

	public static void main(String[] args) {
		//Concatination: adding(joining many Strings together
		
		//I love Java
		String language=" Java";
		//if you want to have Space you should put it inside the String
		System.out.println("I love"+language);
		
		String love="I love";
		System.out.println(love+language);
		
		//also System.out.println(love+" "+language);
		
		String car="BMW";
		//I purchased BMW 2020;
		int year=2020;
		System.out.println("I purchased "+car+" "+year);
		System.out.println("I purchased "+car+" 2020");
		
		
	}
	
}
