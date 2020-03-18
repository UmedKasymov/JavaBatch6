package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*1.Prompt the user to enter person height in inches.
		 * Person should be classified as one of the following:
		 * short(under 60 inches)
		 * medium(btw 60-72)
		 * tall(over 72 inches)
	
		 */
		Scanner input=new Scanner(System.in);
	    System.out.println("Please enter your height in Inches");
		int height=input.nextInt();
		
		if(height>0 && height<=60) {
			System.out.println("You are Short");
		}else if(height>60 && height<=72) {
			System.out.println("You are Medium");
		}else if(height>72) {
			System.out.println("You are Tall");
		}else {
			System.out.println("Invalid height");
		}
	}

}
