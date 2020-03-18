package com.syntax.class07;

public class HW {

	public static void main(String[] args) {
		/*
		 * 1.Print numbers from 1 to 100 in 1 line with space
		 * 2.Print numbers from 100 to 1
		 * 3.Print even numbers from 20 to 1 (2 ways)
		 * 4.Print odd numbers between 20 and 50 (2 ways)
		 */
		
		//Homewrok #1
		int num=1;
		while(num<=50){
			System.out.print(num+" ");
			num++;
		}
		//Homework #2
		int x=50;
		while(x>=1) {
			System.out.println(x);
			x--;
		}
		//Homework #3
		// 1st way!
		int y=20;
		while(y>=1) {
			if(y%2!=0) {
				
				System.out.println(y);
			}
			y--;
		//2nd way!
			
		}
		
		//Homework #4
		int num1=20;// First way1
	       
        while(num1<50) {
        	System.out.println(num1++);
        num1+=2;
        }
        
        //2 way
        int z=20;
        while(z<=50) {
        	if(z%2!=0) {
        		System.out.println(z);
        	}
        	z++;
        }
	}

}
