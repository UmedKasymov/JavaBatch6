package com.syntax.class18;

public class Task2 {

	/*Write a program  that will have 4 different access levels of 
	 * constructors and create 3 objects of this class: 1 - inside 
	 * same class; 2 - from outside the class; 3 - from different class 
	 * inside different package  and observe result.
	 * 
     *Write program that have static constructor and observe result.
	 * 
	 */
	 String name, lastName, schoolName;
	    
	    
		public Task2(){// with no parameters
			System.out.println("I am your constructor with no parameters");
  }
		private Task2(String studentName, String studentLastName, String nameOfSchool ){
			name=studentName;
			lastName=studentLastName;
			schoolName=nameOfSchool;
}
		protected Task2(String nameOfSchool) {
			System.out.println(nameOfSchool);
		}
		public static void main(String[] args) {
			Task2 obj=new Task2();
			Task2 obj1=new Task2("Umed","Kasymov", "Syntax Technologies");
			Task2 obj2=new Task2("Syntax Technologies!");
			
	}
}



