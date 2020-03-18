package com.syntax.class07;

public class IncrementDecrement {
	public static void main(String[] args) {
		
		int x=10;
		x=x+1;
		x+=1;
		//ANOTHER WAY TO ADD +1 TO A VARIABLE
		x++;
		System.out.println(x);
		
		int y=90;
		y-=1; //y=y-1;
		// another way to subtract -1 from a VARIABLE
		y--;
		System.out.println(y);
		
		
		//1++; compiler will give error
		//2--; 
		//Increment and decrement operator used with variables ++ or -- an this
		//operators will be used with LOOPs statements
		// LOOPs is Java: execute block of code multiple times
		// LOOPS: ==WHILE/ DO WHILE/FOR==
		//ENHANCED FOR LOOP/ADVANCED FOR LOOP/FOR EACH LOOP
		//System.out.println("Good Morning"); (code reduntentcy)
		//System.out.println("Good Morning");
		//System.out.println("Good Morning");
		//System.out.println("Good Morning");
		//System.out.println("Good Morning");
	    
		int time=10;
		if(time<12) {
			System.out.println("Good Morning");
		}
	while(time<12) {
		System.out.println("Good Morning");
	}
	System.out.println("---------WHILE LOOP-----");
	
	while(time<=12) {
		System.out.println("Good Morning");//-->condition will be true 3 times
		time++;
	}
	}

}
