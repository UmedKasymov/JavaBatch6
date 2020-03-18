package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		//Scanner class-->it take input from a user
		//we will provide input value from a console
		// then that value will taking and used  
		
		//Bring Scanner class into a program
		//class variable        //identifies our keyboard
		Scanner scan=new Scanner(System.in);
		//Instruct user to what program expects
		System.out.println("Please enter any text");//instruction given later
		//Capture line of Strings from a user
		String text=scan.nextLine();
		
		System.out.println(text);
		
		System.out.println("Please enter any number");//instruction given later
		//capture number from a user
		int number=scan.nextInt();
		System.out.println(number);
		
		System.out.println("End of the program");
		
		
	}

}
