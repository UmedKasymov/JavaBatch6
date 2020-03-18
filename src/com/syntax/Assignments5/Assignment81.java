package com.syntax.Assignments5;

public class Assignment81 {

	public static void main(String[] args) {
		/*For you to do:
			Write a program that prints the highest value in the array.
			
			Expected Output:
			8
		 * 
		 */
		//for(int i: nums) {
		//if(i>largest1) {
		//	largest1=i;
		//System.out.println("The largest number in this array is "+largest1);
		
		//================================
		//int largest=nums[0];//200 we assume that "200" is the largest number
		//for(int i=1; i<nums.length; i++) {//we start with "1"cause in previous line we already mentioned 0
			//if(nums[i]>largest) {
				//largest=nums[i];
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	  int largest=a[0][0];
	  for (int[] row:a) {
		  for(int col:row) {
			  if (col>largest) {
				  largest=col;
			  }
		  }
	  }
	  System.out.println(largest);
}
}
