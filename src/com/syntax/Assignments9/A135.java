package com.syntax.Assignments9;

public class A135 {

	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(getMax(arr)); //should print 22
	}
	 // Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
}