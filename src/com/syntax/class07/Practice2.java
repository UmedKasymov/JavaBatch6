package com.syntax.class07;

public class Practice2 {

	public static void main(String[] args) {
		boolean rain=true;
		
		if(rain) {
			System.out.println("Take umbrealla");// 1 time
		}
System.out.println("====================================================");
		while(rain) {
			System.out.println("Take umbrealla");//infinite
		}
		while(rain) {
			System.out.println();
			rain=false;
		}
	}

}
