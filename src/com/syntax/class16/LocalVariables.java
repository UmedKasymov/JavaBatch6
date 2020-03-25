package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
		
	String name="John";//local variable cause it lives inside the scope of this body.
		               //local variable that visible only within method it was declared.
	}
	
	void anotherName() {
		
		String name="Jane";
	}
	                                //local variable
	public static void main(String[] args) {
		
		//System.out.println(name);CE: name won't be visible to another method
		//since its scope only within nameInside method
		
		              //local variable inside the main method
		LocalVariables obj=new LocalVariables();
		obj.nameInside();
		
		boolean flag=true;
		
		if(flag) {
			String answer="Yes";
		}
		//System.out.println(answer);CE: the scope of variable answer is not visible 
		//outside of the if condition
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		String name="Gulbahar";
	}

}
