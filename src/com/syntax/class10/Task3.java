package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		// 
	      String[] countries= {"USA", "France", "Germany", "China", "Great Britain"};
	        String[] capitals= {"Washington DC", "Paris", "Berlin", "Beijing", "London"};
	        
	        for(int i=0; i<countries.length; i++) {
	                System.out.println("The capital of "+countries[i]+" is "+capitals[i]);

	}
	        String[] countries1= {"USA", "Tajikistan", "France", "Poland"};
	        for (int y=0; y<countries1.length; y++) {
	        	
	        	switch(countries1[y]) {
	        	
	        	case "USA":
	        		System.out.println("The capital city is Washington DC");
	        		break;
	        	case "Tajikistan":
	        		System.out.println("The capital city is Dushanbe");
	        		break;
	        	case "France":
	        		System.out.println("The capital city is Paris");
	        		break;
	        	case "Poland":
	        		System.out.println("The capital city is Warsaw");
	        		break;
	        		
	        	}
	        	
	        }
	}
}
