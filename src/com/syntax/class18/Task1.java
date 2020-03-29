package com.syntax.class18;

public class Task1 {
	/*
	 * Write a program that will have a constructor: one with parameters and 
	 * second without any parameters. Create a separate Test class where you 
	 * will execute both of the constructors.
     *
     *Write a java program of Class Students that takes students name 
     *and 3 subject grades. Inside your class also have a method to 
     *Calculate Average Grade. Test Student class for 5 different students 
     *with different marks. Your program should print an average mark of each 
     *students name.
     *
     *NOTE: please use different names for instance and local variables.
	 */
    String name;
    int grade1,grade2, grade3;
    
	Task1(){// with no parameters
		System.out.println("I am your constructor with no parameters");
	
 }
	Task1(String str){
		System.out.println("I am a construtor with a String parameter "+str);
	}
	Task1(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
		name=studentName;
		grade1=studentGrade1;
		grade2=studentGrade2;
		grade3=studentGrade3;
	}
	public int gradeAverage() {
		int total=grade1+grade2+grade3;
		int avg=total/3;
		return avg;
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		Task1 obj1=new Task1("Hello!");
		
		Task1 s01= new Task1("Umed", 80, 85, 90);
		System.out.println(s01.name+"'s average grade is : "+s01.gradeAverage());
		Task1 s02= new Task1("Aslan", 60, 70, 100);
		System.out.println(s02.name+"'s average grade is : "+s02.gradeAverage());
		Task1 s03= new Task1("John", 77, 88, 99);
		System.out.println(s03.name+"'s average grade is : "+s03.gradeAverage());
		Task1 s04= new Task1("Nursultan",100, 100, 100);
		System.out.println(s04.name+"'s average grade is : "+s04.gradeAverage());
		Task1 s05= new Task1("Kuba", 75, 85, 95);
		System.out.println(s05.name+"'s average grade is : "+s05.gradeAverage());
	}
}
