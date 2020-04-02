package com.syntax.class20;

public class A {

	//Home work-task-1 & 2-March29-2020//
	
		String firstname;
		String lastname;
		A(){
			System.out.println("I am parent class-A-constructor");
		}
		static void printF() {
			System.out.println("test of Home work-Task-2");
		}
	}
	public class B extends A {
		long phoneNumber;
		double salary;
		B(){
			System.out.println("This constructor is from Class B");
		}
	}
	public class C extends B {
		String address;
		C(){
			System.out.println("this constructor is from class C.");
		}
	}
	//for Testing inheritance of class A==>B==>C
	public class TestABC {
		public static void main(String[] args) {
			System.out.println("===HW-Task-1--Testing===============");
			System.out.println("==Parent class A======");
			A classA=new A();
			System.out.println("\n"+"==Sub class B======");
			System.out.println("==Testing task-1==");
			B classB=new B();
			System.out.println("\n"+"==Testing task-2==");
			classB.printF();
			System.out.println("\n"+"==Sub class C======");
			C classC=new C();
		}
	}

