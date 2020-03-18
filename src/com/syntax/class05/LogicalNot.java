package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
	//NOT- reverse the condition
	boolean b=!true;
	boolean val=!false;
	
	System.out.println(b);
    System.out.println(val);
    
    boolean isCloud=!true;// true; Output: "Bye"
    if(!isCloud) {
    	System.out.println("Hello");
    }else {
    	System.out.println("Bye");
    }
    
    String day1="Monday";
    String day2="Friday";
    // if it is not Monday or Friday-->Find me at Syntax
    
    if(!day1.equals("Monday") || day2.equals("Friday")) {
    	System.out.println("Find me at Syntax");
    }   
  
	}
}
