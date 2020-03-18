package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		/*
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * 
		 * First Output: "Enter name of the instructor"
		 * 
		 * case 1: if User provided the name as Shiva as input it should show
		 * "Will take care of Java Assignment" 
		 * case 2: if User provided the name as
		 * Sandish as input it should show "Will take care of SDLC Assignment" 
		 * case 3:
		 * if User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" 
		 * case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment"
		 * 
		 * Other than these four names if the user provides any other names --> "
		 * Invalid instructor selected
		 */

		Scanner input=new Scanner(System.in);
		String responsibility;
		String instructor;
		System.out.println("Enter name of the instructor");
		instructor=input.nextLine();
		
		switch(instructor) {
		
		case "Shiva":
		    responsibility="Will take care of Java Assignment";
		    break;
		
		case"Sandish":
			responsibility="Will take care of SDLC Assignment";
			break;
			
		case"Weqas":
			responsibility="Will take care of Selenium Assignment";
			break;
		
		case"Asel":
			responsibility="Will take care of every Assignment";
			break;
			default:
			responsibility="Invalid instructor selected";
			
		
		}
		
		System.out.println(responsibility);
	}
}
