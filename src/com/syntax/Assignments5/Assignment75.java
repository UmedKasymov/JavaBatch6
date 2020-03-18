package com.syntax.Assignments5;

public class Assignment75 {

	public static void main(String[] args) {
		/*For you to do: 
			Write a program that creates an array of integers that stores the following values
			{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
			Using a for loop print values from that array and output should look like below
			
			Output:
			78 13 11
			
			Note: Find out what is the start point an how much you need to increment to get the result.
		 * 
		 */
		int [] nums={45, 78, 12,  67, 55, 89, 23, 77, 88};
		
		for(int i=1; i<nums.length; i+=3) {
			System.out.print(nums[i]/i+" ");
		
		}
}
}