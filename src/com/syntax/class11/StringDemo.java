package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String school=" Syntax ";
		String str=new String("Hello");
		String str1="This a String 7676, &^&^";
		
		System.out.println("------------LENGTH FUNC-------");
		//how many characters String has
		System.out.println(school.length());//function/method"the length"
		int size=str.length();
		System.out.println("String length is "+size);
		
		System.out.println("------------TOUPPER/LOWER FUNC-------");
		//convert String to lower case or upper case
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		System.out.println("------------CONCATINATE FUNC-------");
		//concatinate 2 Strings
		String newString=str+school;// plus sign can compare two different type data(for attaching)
		System.out.println(newString);
		
		String day="Saturday";
		String date="14";
		String newDate=day.concat(" "+date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		//below code will give compile error, since concat() method used attached one String to 
		//another String
		//str.concat(grade);
		
		System.out.println("------------isEmpty FUNC-------");// tells true if there is no characters 
		//inside the String
		// and tells false if there is characters inside the String
        String str3="";
        boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("------------trim() FUNC-------");//removes white spaces
		String str4="    Welcome to Syntax!   !";// it will cut out the beginning and end Spaces
		str4=str4.trim();
		System.out.println("String with no leading or trailing speces:"+str4);
		
		
		
	}
}
