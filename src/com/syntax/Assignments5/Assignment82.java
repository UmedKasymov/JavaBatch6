package com.syntax.Assignments5;

public class Assignment82 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		Write a program that will print the sum of all elements in 2D array. 
		
		Expected Output:
		-9
		 */
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				sum+=a[i][j];
			}

		}
		System.out.println(sum);
	}

}
