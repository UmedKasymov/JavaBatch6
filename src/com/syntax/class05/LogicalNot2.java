package com.syntax.class05;

public class LogicalNot2 {

	public static void main(String[] args) {

    
    String day1="Tuesday";
    //if it is not Monday or Friday-->Find me at Syntax
    
    //day is not Monday and day is not Friday
    if(!(day1.equals("Monday") && day1.equals("Friday"))){
    	System.out.println("Find me at Syntax");
    	
    //	day is not Monday and day is not Friday
    if(!(day1.equals("Monday") || day1.equals("Friday"))){
    	    	System.out.println("Find me at Syntax");
    }

	}
	}
}
