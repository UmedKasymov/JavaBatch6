package com.syntax.class16;

public class InstanceVariables {
	
	String name="John";//instance variable
	
	public static void main(String[] args) {
		
		String name="Yunus";
		System.out.println(name);//Yunus
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);//John
		
		obj.name="Ali";
		System.out.println(name);//Yunus
		System.out.println(obj.name);//John to Ali
		
		//change of local variable
		name="Farid";
		System.out.println(name);//Farid
	}

}
