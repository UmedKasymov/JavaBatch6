package com.syntax.Assignments6;

public class Assignment86 {

	public static void main(String[] args) {
	
		/*For you to do:
		Create a String "name" and assign the value "Timmy" to it. 
		Find out how many characters are there in the given String. 
		 * 
		 */

		String name="Timmy";
		int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < name.length(); i++) {    
            if(name.charAt(i) != ' ')    
                count++;    
        }    
		System.out.println(count);
	}

}
