package com.syntax.class11;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Hello";
		String str2=new String("Hello");
		
		
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are NOT equal");
		}
		System.out.println("-----------Comparing Using ====OPERATOR=======");
		if(str1==str2) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are NOT equal");
		}
		String str3="Hello";
		if(str1==str3) {
			System.out.println("Strings are equal str3");
		}else {
			System.out.println("Strings are NOT equal str3");
		}
	}

}
