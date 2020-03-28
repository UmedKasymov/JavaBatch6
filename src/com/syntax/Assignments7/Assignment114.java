package com.syntax.Assignments7;

public class Assignment114 {

	/*Write a method header on line two with the following specs:    

		Returns:
		a String
		Name:
		spaceOut
		Parameters:
		a String
		
		Then complete the method by programming the following behavior
		Insert spaces after every character in the String s, then return the new string.
		See below examples (note the space at the end as well).
		
		Examples:
		spaceOut("hello") ==> "h e l l o "
		spaceOut("technology") ==> "t e c h n o l o g y "
	 * 
	 */
	
	    public static String spaceOut(String s)
	    {
	        String result ="";
	        for(int i=0;i<s.length();i++)
	        {
	            result+=s.charAt(i)+" ";
	        }
	        return result;
	    }
	    //test case below (dont change):
	    public static void main(String[] args){
	        System.out.println(spaceOut("hello")); //"h e l l o "
	        System.out.println(spaceOut("technology")); //"t e c h n o l o g y "
	    }
	}
