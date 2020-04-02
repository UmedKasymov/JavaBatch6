package com.syntax.class20;

public class TestingTeacherProgram {

	/*
	 * Write program for multilevel inheritance where class A inherited by B and
	 * class B inherit class by C.
	 * 
	 * 
	 * Write program to inherit class A that has method printF which is static and
	 * call or reuse that method into class B
	 * 
	 * 
	 * Write a Java program called Teacher. Identify features and behaviour of that
	 * Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
	 * that would have it their own features and behaviour. Test all 4 classes
	 * 
	 */
	//Home Work-Task-3==March 29-2020\\
	
		public static void main(String[] args) {
			System.out.println("==Parent class--Testing========================");
			TeacherParentClass teacher=new TeacherParentClass();
			teacher.displayParent();
			System.out.println("\n==MathTeacher Sub Class--Testing=======================");
			MathTeacherSubClass teacher1=new MathTeacherSubClass();
			teacher1.displayParent();
			teacher1.print("Math");
			System.out.println("\n==ChemistryTeacher Sub Class--Testing=======================");
			ChemistryTeacherSubClass teacher2=new ChemistryTeacherSubClass();
			teacher2.displayParent();
			//teacher2.print("Chemistry");//can't inherit
			teacher2.testing();
			System.out.println("\n==PianoTeacher Sub Class--Testing=======================");
			PianoTeacherSubClass teacher3=new PianoTeacherSubClass();
			teacher3.displayParent();
			teacher3.play();
		}
	}
	public class TeacherParentClass {
		String schoolName;
		String address;
		TeacherParentClass() {
			System.out.println("this constructor is from Parent class(TeacherParentClass)");
		}
		void displayParent() {
			schoolName = "Syntax technologies.";
			address = "14120 Newbrook Dr Suite 210, Chantilly, VA 20151";
			System.out.println("\nthis is from TeacherParentClass\n==================");
			System.out.println("School Name= " + schoolName + "\n" + "Address is: " + address);
		}
	}
	public class MathTeacherSubClass extends TeacherParentClass {
		String name, courseName;
		void print(String courseName) {
			this.courseName=courseName;
			System.out.println("============\nI teach "+courseName+"// (Method from 'MathteacherSubClass'.)");
		}
		MathTeacherSubClass(){
			System.out.println("This constructor is from MathTeacherSubClass. ");
		}
	}
	public class ChemistryTeacherSubClass extends TeacherParentClass {
		String lab;
		void testing() {
			lab="Chemistry";
			System.out.println("============\nThis method is from "+lab+" Teacher Sub Class.");
		}
		ChemistryTeacherSubClass(){
			System.out.println("This constructor is from ChemistryTeacherSubClass. ");
		}
	}
	public class PianoTeacherSubClass extends TeacherParentClass {
		String instrument;
		void play() {
			instrument="Piano";
			System.out.println("============\nWe play "+instrument+" \\ this is from PianoTeacherSubClass\\");
		}
		PianoTeacherSubClass(){
			System.out.println("This constructor is from PianoTeacherSubClass. ");
		}
	}
	/////Result////////
	==Parent class--Testing========================
	this constructor is from Parent class(TeacherParentClass)
	this is from TeacherParentClass
	==================
	School Name= Syntax technologies.
	Address is: 14120 Newbrook Dr Suite 210, Chantilly, VA 20151
	==MathTeacher Sub Class--Testing=======================
	this constructor is from Parent class(TeacherParentClass)
	This constructor is from MathTeacherSubClass. 
	this is from TeacherParentClass
	==================
	School Name= Syntax technologies.
	Address is: 14120 Newbrook Dr Suite 210, Chantilly, VA 20151
	============
	I teach Math// (Method from 'MathteacherSubClass'.)
	==ChemistryTeacher Sub Class--Testing=======================
	this constructor is from Parent class(TeacherParentClass)
	This constructor is from ChemistryTeacherSubClass. 
	this is from TeacherParentClass
	==================
	School Name= Syntax technologies.
	Address is: 14120 Newbrook Dr Suite 210, Chantilly, VA 20151
	============
	This method is from Chemistry Teacher Sub Class.
	==PianoTeacher Sub Class--Testing=======================
	this constructor is from Parent class(TeacherParentClass)
	This constructor is from PianoTeacherSubClass. 
	this is from TeacherParentClass
	==================
	School Name= Syntax technologies.
	Address is: 14120 Newbrook Dr Suite 210, Chantilly, VA 20151
	============
	We play Piano \ this is from PianoTeacherSubClass\