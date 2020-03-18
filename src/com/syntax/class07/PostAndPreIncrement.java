package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
	
    // ++, --
	// PreIncrement ++y, PostIncrement y++
		int z;
		int y=10;
		z=y++;//post incrememnt=first use the variable and then increment
		System.out.println(z);
		
		int w;
		int x=10;
		w=++x; //pre incrememnt=first inrement and use it and assign it
		System.out.println(w);
		
		int num=1;
		while(num<5) {
		System.out.println(++num);
		}
		System.out.println("==========================");
		int num1=1;
		while(num1<5) {
			System.out.println(num1++);
		}
	}

}
