package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		
		int num1;// first declare
	    num1=10;//then initialize it
	    
	    //declare an array and initialize it
	    
	    int[] array=new int[4];
	    array[0]=10;//Note: in programming index always start with "0"!
	    array[1]=20;
	    array[2]=30;//array-->collection of the same data type
	    array[3]=40;//[]-->index
	    
	    //access elements from an array
	    System.out.println(array[1]);
	    // 2 way
	    String[] carArray;// preferred way
	    //String carArray1[]-->another way of expressing it!
	    
	    carArray=new String[3];
	    carArray[0]="BMW";
	    carArray[1]="Honda";
	    carArray[2]="Toyota";
	    //I am driving Toyota
	    System.out.println("I am driving "+carArray[2]);
	    ///////////////////////////////////////////////////
	    int[] numbers=new int[3];
	    numbers[0]=100;
	    numbers[1]=200;
	    numbers[2]=300;
	    //change value of numbers[1]
	    numbers[1]=2000;
	    System.out.println(numbers[1]+numbers[0]+" ilhom .......");// it wont work if you put "ilhom.."
	    // before the index 1+index 0
	    
	}

}
