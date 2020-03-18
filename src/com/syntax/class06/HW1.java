package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*1.	Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * 
		 */
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		 
		case "Tajikistan":
			language="Tajik";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Kyrgyzstan":
			language="Kyrgyz";
			break;
		case "Kazakhstan":
			language="Kazak";
			break;
		case "England":
			language="English";
			break;
			default:
				language="Unknown";
		}
		System.out.println("Your native language is "+language);
	}

}
