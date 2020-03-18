package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment36 {

	public static void main(String[] args) {
		
		  Scanner input=new Scanner(System.in);
		  String word1;
		  String word2;
		  String result = null;
		  int num1;
		  int num2;
		  System.out.println("Please enter two strings");
		  word1=input.nextLine();
		  word2=input.nextLine();
		  System.out.println("Please enter two numbers");
		  num1=input.nextInt();
		  num2=input.nextInt();
		  
		  if(num1==num2 && (word1.compareTo(word2))==0) {
			  result="AND";
		  }else if(num1==num2 || (word1.compareTo(word2))==0){
			  result="OR";
		
		  }else if(!(num1==num2 || (word1.compareTo(word2))==0)) {
			  result="NONE";
		  }
			  System.out.println(result);
		  }
	}
		
	

