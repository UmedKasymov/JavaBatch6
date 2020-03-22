package com.syntax.class15;

public class EvenOdd {
	void number(int evenOdd) {
		if(evenOdd%2==0) {
			System.out.println(evenOdd+ " is even number");
		}else {
			System.out.println(evenOdd+" is Odd number");
		}
	}
	public static void main(String[] args) {
		EvenOdd num=new EvenOdd();
		num.number(9);
		
	}
}


