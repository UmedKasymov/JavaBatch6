package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		//
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		// getting all elements
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("==============printing using advanced for loop=============");
		for (char grade : grades) {// inside of my grades I have collection of grade
			System.out.println(grade + " ");
		}
		System.out.println();
		
		
		// create an array of fruits and retrieve all elements
		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		// if fruit is apple-->that is your favorite fruit
		// advanced for loop, enhanced for loop, for each loop
		
		for (String fruit : fruits) {
			if (fruit.equals("Apple")) {
				System.out.println(fruit + " is yout favorite fruit");
			} else {
				System.out.println(fruit);
			}
			System.out.println("=======================");
			// regular for loop
			for (int i = 0; i < fruits.length; i++) {
				System.out.println(fruits[i]);
			}
		}
	}
}