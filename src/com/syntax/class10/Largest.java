package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// find the largest element from an array
		int[] nums= {200, 30, -1, 900, 56, 787};
		//   for (int i=0;i<nums.length; i++) {
			//  if(nums[i]>nums[0]) {
				//  nums[0]=nums[i];
				//  System.out.println(nums[0]);

	
			//=====================================
		int largest=nums[0];//200 we assume that "200" is the largest number
		for(int i=1; i<nums.length; i++) {//we start with "1"cause in previous line we already mentioned 0
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
				System.out.println("The Largest num is "+largest);
		System.out.println("===============================");
			
			int largest1=0;
			
			for(int i: nums) {
				if(i>largest1) {
					largest1=i;
				}
			}
			System.out.println("The largest number in this array is "+largest1);
   }
 }

