package com.syntax.Assignments2;

import java.util.Scanner;

public class Assignment32 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		String gender=input.next();
		System.out.println("Please enter age");
		int age=input.nextInt();
		
		if(age>=25 && (gender.equals("F"))) {
		 System.out.println("Woman");
		 }else if(age<25 &&(gender.equals("F"))){
			 System.out.println("Girl");
		}else if(age>=25 && (gender.equals("M"))) {
			System.out.println("Man");
		}else {
			System.out.println("Boy");
		}
		
	}
	}

