package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/*Write a program to ask user if there is a sale
		 * if no sale-->not going to shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and calculate final price
		 * 
		 * if the price less than 20-->apply10%
		 * if the price between 20-->and 100-->apply 20%
		 * if the price between 100 and 500-->apply 30%
		 * if the price more than 500-->apply 50%
		 * 
		 *  After discount___the price of the item reduced from original price to final price
		 */
		
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan =new Scanner(System.in);
		System.out.println("Is there any sales?");
		sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price?");
			price=scan.nextDouble();
	        if(price<20) {
				discount=price*0.1;
				//finalPrice=price-discount;
			}else if(price>=20 && price<=100) {
				discount=price*0.2;
				//finalPrice=price-discount;
			}else if(price>100 && price<=500) {
				discount=price*0.3;
				//finalPrice=price-discount;
			}else{
				discount=price*0.5;	
				//finalPrice=price-discount;
			}
	        finalPrice=price-discount;
	        System.out.println("After "+discount+" discount the price of the item reduced from "+price+" to "+finalPrice);
			
		}else{
		    System.out.println("No shopping day");
		
		}
		
		}	
	}

