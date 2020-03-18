package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message="Welcome Admin!";
		// verify that mesage contains username whic is Admin
		System.out.println("------------contains FUNC----------------");
		System.out.println(message.contains("Admin"));
		boolean flag=message.contains("Welcome");
		System.out.println(flag);
		//we want to see if welcome starts with Welcome
		System.out.println("------------startsWith() FUNC----------------");
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		//We want to verify that welcome message end with username
		System.out.println("------------endsWith() FUNC----------------");
		String username="Admin";
		boolean ends=message.endsWith(username);
		System.out.println(ends);
		System.out.println(message.endsWith("!"));
		
		
		
	}

}
