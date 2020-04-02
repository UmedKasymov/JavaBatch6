package com.syntax.class15;

import java.util.Scanner;

public class Polidrome {
	void palindrome() {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("please enter a text:");
		    String text = sc.nextLine();
		   	//write your code below
		   	String s1="";
		   	text=text.replace(" ", "").trim();
		   	int x=text.length();
		   	for (int i=x-1;i>=0;i--){
		   	  s1=s1+text.charAt(i);
		   	}
		   	  if(s1.equalsIgnoreCase(text)){
		   	     System.out.println(" This Text is a palindrome");
		   	  }else{
		   		System.out.println("This Text is NOT a palindrome");
		   	  }
	}
	public static void main(String[] args) {
		text.palindrome("abba");
	}
}