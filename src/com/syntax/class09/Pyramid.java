package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		// PRINT THE TRIANGLE STAR "*"
		for (int r = 1; r <= 4; r++) {// rows
			for (int c = 1; c <= r; c++) {// columns Note: my number of columns can be less than rows
											// or equal to rows, but never exceed the row number.
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("===printing number pyramids");
		for (int r = 1; r <= 5; r++) {// rows
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("==================");
		//55555
		//4444
		//333
		//22
		//1
		for(int i=5; i>=1; i--) {// rows
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
			}
		}
	}
