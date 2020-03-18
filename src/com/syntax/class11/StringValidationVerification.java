package com.syntax.class11;

public class StringValidationVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		
		//to compare 2 Strings
		System.out.println("-----------equals() equalsIgnoreCase() FUNC--------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home-Syntax Technologies";//to make Automation Testing
		String actual="  Home-Syntax Technologies  ";
		
		if(actual.equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		System.out.println("------FIRST TRIM AND COMPARE------");
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
			
		}
		String browser="CHROME";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on the chrome browser");
			
		}
		//OR
		
		if(browser.toLowerCase().equals("chrome")) {
			System.out.println("Test executed on the chrome browser");
			
		}
	}

}
