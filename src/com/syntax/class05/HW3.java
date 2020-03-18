package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
	
		Scanner input;
		double num1,num2,num3,largest = 0;
		input=new Scanner(System.in);
		System.out.println("Please enter a double value");
		//double num1;
		num1=input.nextDouble();
		System.out.println("Please enter second double value");
		//double num1;
		num2=input.nextDouble();
		System.out.println("Please enter third double value");
		//double num1;
		num3=input.nextDouble();
		
		if(num1>num2 && num1>num3) {
		    largest=num1;
		}else if(num2>num1 && num2>num3) {
			largest=num2;
		}else if(num3>num1 && num3>num2) {
			largest=num3;
		}
		System.out.println("The largest number is "+largest);
	}

}
