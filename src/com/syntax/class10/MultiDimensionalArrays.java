package com.syntax.class10;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// int [][]=new int[3][4]//[rows][columns]

		int[][] numbers=new int[3][4];
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2 row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;//2nd row 3rd column
		numbers[1][3]=20;
		//3 row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		//Print value of 15
		System.out.println(numbers[1][2]);
		
	
	int[][]nums= {//array of 3 single dimensional arrays
					{10, 20, 30, 40},
					{5, 10, 15,20},
					{1,2,3,4}
					};
	System.out.println(nums[2][3]);//index number//row //column//retrieve 4
	System.out.println(nums[0][2]);//retrieve 30
	
	}
 }








