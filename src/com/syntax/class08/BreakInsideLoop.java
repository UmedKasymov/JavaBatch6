package com.syntax.class08;

public class BreakInsideLoop {

	    public static void main(String[] args) {
	        int i = 1;
	         
	        while (true) 
	        {
	            if(i > 5)
	                break;// breaks the inside the loop
	             
	            System.out.println(i);
	            i++;
	        }
	        System.out.println("================================================");
	    }
	    
	
	    {
	        
	        for (int i = 1; i <= 10; ++i) {      
	           if (i == 5) {
	              break;
	           }      
	           System.out.println(i);
	        }   
	     }
	  
	    
	}

