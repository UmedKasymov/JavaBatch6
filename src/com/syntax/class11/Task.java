package com.syntax.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
			/*Accept username, password and confirm password from a user and check following requirements:

			Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
			Password should be minimum 8 characters, if less → message=“Password is too short”.
			Password cannot contain username if so, → message=“Password cannot contain username”.
			Password should match confirmed password, if not  → message=“Passwords do not match”.
			
			Only after all requirements met → message “Your username and password has been created”
		 * 
		 */
		Scanner input=new Scanner(System.in);
		String confirmed="Password3#";
		System.out.println("Please enter your username:");
		String user = input.nextLine();
		
		System.out.println("Please enter your password:");
		String pw=input.nextLine();
		
		if(user.isEmpty() || pw.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else if(pw.length()<8) {
			System.out.println("Password is too short");
		}else if(pw.contains(user)) {
			System.out.println("Password cannot contain username");
		}else if(!pw.equals(confirmed)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your user name and password has been created");
		}
 } 
}