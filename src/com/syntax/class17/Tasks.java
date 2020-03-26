package com.syntax.class17;

public class Tasks {
	
	/*
	 * Create a method that will accept an array as parameters and will 
	 * return a sum of all elements from that array. Method should be visibly only 
	 * within same package and accessible by the creating an instance of the class.
	 * 
	 * 
	Create a method that will take a String as a parameter and returns reverse String.
	 Method should be available to all classes within your projects and accessible 
	 by class name.
 
		Create a method that will accept a String as a parameter and return 
		a new String that consist only of vowels. Method should be available inside 
		the class where it was declared and executed by calling it is name.
	 */

	protected int array(int [] a) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Tasks task1=new Tasks();
		int[] y= {2,7,19,17};
		int array=task1.array(y);
		System.out.println("total: "+array);
	}
}