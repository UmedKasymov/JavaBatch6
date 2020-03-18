package com.syntax.Assignments2;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=in.nextLine();
		
		System.out.println("Enter you mobile number");
		
		String phoneNum=in.nextLine();
		String s1=String.valueOf(phoneNum);
		String phoneFormat=(s1.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
		
		System.out.println("Enter your age");
		int age=in.nextInt();
		
		System.out.println("Your name is "+name+","+" your age is "+age+" and your mobile number is "+phoneFormat);
	
		

	}

}
