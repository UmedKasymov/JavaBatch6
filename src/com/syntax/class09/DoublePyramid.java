package com.syntax.class09;

public class DoublePyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {// rows
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
