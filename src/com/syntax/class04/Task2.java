package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		
		int mortgagePrice=300000;
		double mortgageRate=4.7;
		
		

		if(mortgageRate>4.5) {
			System.out.println("Customer won't buy a house");
		}else {
			System.out.println("Yes, I am buying the house");
			
			if(mortgagePrice>200000) {
				System.out.println("I will need mortgage");
		}else {
			System.out.println("Will pay Cash");
		}
	}
}
}
