package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 	
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 		 
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 * 		  
		 */
		char[] array=new char[5];
	    array[0]='A';
	    array[1]='B';
	    array[2]='C';
	    array[3]='D';
	    array[4]='E';
	    System.out.println(array[1]);

	char[] grades= {'A','B','C','D','E','F'};
	//getting all elements
	for(int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
	}
	
}
}