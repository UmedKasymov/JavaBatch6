package com.syntax.class04;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your City");
		String city=in.nextLine();
		System.out.println("Please enter the temperature");
		
		int temp=in.nextInt();
		double celsius=((temp-32)*5)/9;
		int temp1=(int)celsius;
		
		System.out.println("The temperature in the city "+city+" is "+temp1 +" degree celsius");
        
	}

}
