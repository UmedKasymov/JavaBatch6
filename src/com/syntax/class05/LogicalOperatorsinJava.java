package com.syntax.class05;

public class LogicalOperatorsinJava {

	public static void main(String[] args) {
		
		//AND (&&)
		/* if(true && true)-->true
		 * if(true && false)-->false
		 * if(false && true)-->false
		 * if(false && false)-->false
		 * 
		 * OR (II)
		 * 
		 * if(true||true)-->true
		 * if(true||false)-->true
		 * if(false||true)-->true
		 * if(false||false)-->false
		 */
		
		/*if declared number is 
		 * btw 1-10-->this number is small
		 * btw 11-100-->this is big number
		 * btw 101-1000-->this is large number
		 */
		int num=78;
		if(num>=1 && num<=10) {
			System.out.println("This number is small");
		}else if(num>10 && num<=100) {
			System.out.println("This is a big number");
		}else if(num>100 && num<=1000) {
			System.out.println("This is a large number");
		}else {
			System.out.println("Number is super large");
		}
	}
}
