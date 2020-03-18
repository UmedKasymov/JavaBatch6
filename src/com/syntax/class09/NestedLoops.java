package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {
		/*Nested Loop: loop inside the loop!
		 * Outer loop controls the number of iterations of inner loop
		 * 
		 */
		for(int i=1; i<=3; i++) {
			System.out.println("Im the outter loop");//one//one//one
			for(int j=1; j<=3; j++) {
				System.out.println("Im an inner loop");//3 times//3 times//3 times
			}
			System.out.println("=========================================");
		}
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=3; j++) {
				System.out.println(i+" "+j);
			}
}
		System.out.println("======================================");
		//using nested loop to print 10 to 99
           for(int i=1; i<=9; i++) {
			
			for(int j=0; j<=9; j++) {
				System.out.println(i+""+j);
}
           }
	}
}