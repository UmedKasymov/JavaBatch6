package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment44 {

	public static void main(String[] args){
	    
	    Scanner input=new Scanner(System.in);
	    String carOrigin;
	    String carMake;
	    System.out.println("Please enter your favorite car make");
	    carMake=input.nextLine();
	    
	    switch(carMake){
	      
	      case "BMW":
	        carOrigin="german car";
	        break;
	      case "Toyota":
	        carOrigin="japanese car";
	        break;
	      case "Maserati":
	        carOrigin="italian car";
	        break;
	        default:
	        carOrigin="unknown";
	      }
	      
	      System.out.println("Your favorite car is "+carOrigin);
	      
	  }

}
