package com.syntax.Assignments7;

public class Assignment103 {

		 
	    String name; 
	    String breed; 
	    String color;
	    
	    object3.bark();
        object3.run();
        object3.play();
        
        object2.bark();
        object2.run();
        object2.play();
        
	    void bark() {
	        System.out.println(breed+" can bark");
	    }
	    
	    void run() {
	        System.out.println(breed+" can run");
	    }
	    
	    void play() {
	        System.out.println(breed+" can play");
	    }
	    
	    public static void main(String[] args){
	     
	       
	        object1.bark();
	        object1.run();
	        object1.play();
	        
	        Object object2 = new Object();
	        object2.breed = "Bulldog";
	        object2.color = "Brown";
	        object2.name = "Maxi";
	       
	        
	        
	        Object object3 = new Object();
	        object3.breed = "Labrador";
	        object3.color = "Black";
	        object3.name = "Charlie";
	       
	        
	        
	    }
 }



