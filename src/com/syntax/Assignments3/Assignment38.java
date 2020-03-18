package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment38 {

	public static void main(String[] args) {
		/*For you to do:
          Prompt user with a question: "Is it weekend?"
          If it is not a weekend --> subject="Manual testing"
          Otherwise --> subject="Java"

          Output: 
          "Today you will be learning ____"
		 * 
		 */
		Scanner input=new Scanner(System.in);
		boolean weekend;
		System.out.println("Is it weekend?");
		weekend=input.nextBoolean();
		String result = null;
		
		if(weekend) {
			result="Java";
		}else if(!(weekend)) {
			result="Manual Tetsing";
		}
	System.out.println("Today you will be learning "+result);
	}
	
}
