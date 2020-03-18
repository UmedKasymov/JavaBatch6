package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		
		/*You are a salesman
		 * Ask a user for how much his sales are
		 * based on the amount of sales we need to calculate commission
		 * if sales is btw 1-100-->Commission should be 10%
		 * if sales is btw 100 and 200-->commission should be 20%
		 * if sales is btw 200 and 500-->commission should be 30%
		 * if sales more than 500-->commission should be 50%
		 */
		
		// if your sales are 200-->40$(20%)
		//1. declare all variables that I will need
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		
		if(sales>=1 && sales<=100) {
			//give user 10% commission
	//  System.out.println("Based on your sales your commission is= "+(sales*0.10));
			commission=sales*0.10;
			
		}else if(sales>100 && sales<=200) {
			//give user 20% commission
			commission=sales*0.20;
		}else if(sales>200 && sales<=500) {
			// give user 30% commission
			commission=sales*0.30;
		}else {
			commission=sales*0.50;
			
		}
		System.out.println("Based on your sales your commission is= "+commission);// short way!
	// if commission is >100 -->you are awesome seller
		if(commission>100) {
			System.out.println("You are awesome seller");
		}
	}

}
