package com.syntax.Assignments6;

public class Assignment91 {

	public static void main(String[] args) {
		
		
		/*Create a String given="I love Java classes at Syntax"
		Retrieve 2 Strings from given String and print them 
		
		Expected Output:
		classes at Syntax
		I love Java
		 * 
		 */

		String given="I love Java classes at Syntax";

		String partialString=given.substring(12);
		System.out.println(partialString);

		String partialString1=given.substring(0,11);
		System.out.println(partialString1);

	}

}
