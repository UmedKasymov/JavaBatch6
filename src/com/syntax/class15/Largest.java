package com.syntax.class15;

public class Largest {
	void Largest(int a, int b) {
		if(a>b) {
			System.out.println(a+" is the largest number");
		}else {
			System.out.println(b+" is the largest number");
		}
	}
	public static void main(String[] args) {
		Largest num=new Largest();
		num.Largest(100, 50);
	}
	}
