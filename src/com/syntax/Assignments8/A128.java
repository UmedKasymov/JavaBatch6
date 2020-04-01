package com.syntax.Assignments8;

public class A128 {

	/*Write a method with the following specs:  
	
	Returns:
	an integer
	Name:
	countVowels
	Parameters:
	a String called s
	Purpose:
	count the number of vowels in the string s.  Assume s is all lowercase.
	
	Examples:
	countVowels("obama") ==> 3
	countVowels("happy friday! i love weekends") ==> 9
	 * 
	 */
	public static int countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}
