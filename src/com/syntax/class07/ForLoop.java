package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// Loop--> "FOR":
		// when you know how many times you want to repeat block of code-->
		//you can use Loop For!
		
		//Good morning 5 times//Note: when you know how many times you will be using iteration 
		// the best choice to use "for" Loop!
		
		        //5th  //7th
		//1st   //2nd  //4th
		for(int c=1; c<6; c++) {
			//
			System.out.println("Good Morning");//3rd//6th
		}
		//print numbers from 1 to10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
       //print number from 10 to 1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		//what will be the output
		for(int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
		//what is the output
		int sum=0;
		for(int i=1; i<5; i++) {
			sum=sum+i;
		}
		System.out.println("Value of the sum "+sum);
		// Break key word-->
	}

}







//for(int b=1;b<4;b++){
//      code;
//}