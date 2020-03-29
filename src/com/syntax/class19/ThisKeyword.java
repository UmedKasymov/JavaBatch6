package com.syntax.class19;

public class ThisKeyword {

	int a,b;// instance variables
	
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	public ThisKeyword(int a, int b) {//local variables
		this.a=a;//this.a=100;
		this.b=b;
		
	}
	public void sum(int a, int b) {
		//sum of which variable am I calculating?
		System.out.println("Sum of local variables "+(a+b));//local//300
		System.out.println("Sum of instance variables "+(this.a+this.b));//instance/30
		//Note: When local and instance var has the same name
		//"this" is used to differentiate them.
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(10, 20);//ins va
		obj.sum(100, 200);//local var
		System.out.println("===================================");
		ThisKeyword obj2=new ThisKeyword();//
		obj2.sum(20, 40);
	}
}
