package com.syntax.Assignments2;

import java.util.Scanner;

public class Assignment28 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the length ");
		
		int length=input.nextInt();
		
		System.out.println("Please enter the width ");
		
		int width=input.nextInt();
		
		int area=length*width;
		
		if(length>width) {
			System.out.println("The shape of your object is rectangular");
		}else if(length==width) {
			System.out.println("The shape of your object is square");
			
		}
							
	}

}
