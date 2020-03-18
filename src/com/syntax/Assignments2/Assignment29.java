package com.syntax.Assignments2;

import java.util.Scanner;

public class Assignment29 {

	public static void main(String[] args) {
		
		    Scanner input=new Scanner(System.in);
		    System.out.println("Please enter first number");
		    int num1=input.nextInt();
		    System.out.println("Please enter second number");
		    int num2=input.nextInt();
		    
		    int result=num1*num2;
		    if(result>0){
		      System.out.println("true");
		    }else if(result<0){
		      System.out.println("false");
		      
		    }

	}

}
