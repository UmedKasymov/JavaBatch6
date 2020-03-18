package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment45 {
	public static void main(String[] args){
	    
	    Scanner input=new Scanner(System.in);
	    int num;
	    String week;
	    System.out.println("Input a number between 1-7");
	    num=input.nextInt();
	    
	    switch(num){
	      
	      case 1:
	    	  
	        week="Monday";
	        break;
	      case 2:
	    	  
	        week="Tuesday";
	        break;
	      case 3:
	        week="Wednesday";
	        break;
	      case 4:
	        week="Thursday";
	        break;
	      case 5:
	        week="Friday";
	        break;
	      case 6:
	        week="Saturday";
	        break;
	      case 7:
	        week="Sunday";
	        break;
	        default:
	        week="Invalid";
	        
	    }
	    System.out.println(week);
	  }
	}


