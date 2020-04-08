
package com.syntax.class23;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("---Student Object and Reference Student Type---");
		Student student=new Student();
		student.study();
		student.doHomework();

		System.out.println("---SyntaxStudent Object and Reference SyntaxStudent Type---");
		SyntaxStudent syntax=new SyntaxStudent();
		syntax.doHomework();
		syntax.study();
		syntax.accessParentOverridenMethod();
		syntax.getJob();
		
		System.out.println("---SyntaxStudent Object and Reference Student Type---");
		Student st=new SyntaxStudent();//upcasting
		//Type casting is when you changing one class to another class
		st.study();//runtime polimorphism
		st.doHomework();
		
		
        //SyntaxStudent st1=new Student();//downcasting

	}
}
