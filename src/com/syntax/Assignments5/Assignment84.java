package com.syntax.Assignments5;

public class Assignment84 {

	public static void main(String[] args) {
		/*For you to do:
		Write a program that prints the total number of elements that are negative AND odd
		
		Output:
		3
		 * 
		 */
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int count=0;
		for(int[] row:a) {
			for(int col:row) {
				if (col%2!=0 && col<0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
		
	


