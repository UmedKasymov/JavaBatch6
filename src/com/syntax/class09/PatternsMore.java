package com.syntax.class09;

public class PatternsMore {

	public static void main(String[] args) {
		//PRINTING 5 ROWS OF 1 TO 9
		
		for(int i=1; i<=5; i++) {// rows
			for(int j=1; j<=9; j++) {//columns
				System.out.print(j);
			}
			System.out.println();

	}
		System.out.println("---------------------");
		//printing 
		//54321 5 times
		//54321
		//....
		for(int i=1; i<=5; i++) {// OR for(int i=10; i<=15; i++)
			for(int j=5; j>=1; j--) {//columns
				System.out.print(j);
			}
			System.out.println();
	}
		System.out.println("---------------");
		//printing 
		//55555
		//44444
		//33333
		//22222
		//11111
		for(int i=5; i>=1; i--) {// rows
			for(int j=5; j>=1; j--) {// in this scenario we do not care what will be our inner loop!
				System.out.print(i);
			}
			System.out.println();
	}
}
}

