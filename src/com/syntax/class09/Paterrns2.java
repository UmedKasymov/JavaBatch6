package com.syntax.class09;

public class Paterrns2 {

	public static void main(String[] args) {
		//*****
		//*****
		//*****
		//*****
		for(int i=1; i<=4; i++) {// rows
			for(int j=1; j<=5; j++) {//columns
				System.out.print("*");
			}
			System.out.println();
		}// Print 10x10   "*"
		for(int i=1; i<=10; i++) {// rows
			for(int j=1; j<=10; j++) {//columns
				System.out.print("* ");
			}
			System.out.println();
	}System.out.println("----------------------------------------------------------");
	//12345
	//12345
	//12345
	//12345
	//12345
		for(int i=1; i<=5; i++) {// column
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
	}
		System.out.println("----------");
		//11111
		//22222
		//33333
		//44444
		//55555
		for(int i=1; i<=5; i++) {// rows
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
	}
}
	
}