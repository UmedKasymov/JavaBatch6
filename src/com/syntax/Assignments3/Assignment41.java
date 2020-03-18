package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment41 {

		  public static void main(String[] args){
		    Scanner input=new Scanner(System.in);
		    int age;
		    String baby;
		    System.out.println("enter the age of the Child");
		    age=input.nextInt();
		    
		    switch(age){
		      
		      case 1:
		        baby="You can Crawl";
		        break;
		      case 2:
		        baby="You can Talk";
		        break;
		      case 3:
		        baby="You can Dance";
		        break;
		      case 4:
		        baby="You can get Trouble";
		        break;
		        default:
		        baby="I don't know how old you are";
		      
		    }
		    System.out.println(baby);
		  }
	}

