package com.syntax.class17;

public class Employee {

	//create variables to hold name, last name , title, ssn;
	public static String title;
	
	public String name;//with access modifier//accessible everywhere
	protected String lastName;//accessible within the same package//exception?
	double salary;//default //accessible within the same package
    private long ssn;//accessible only within the same class
    
    public static void method1() {
    	System.out.println("Im a public method");
    }
    protected void method2() {
    	System.out.println("Im a protected method");
    }
    void method3() {
    	System.out.println("Im a default method");
    }
    private void method4() {
    	System.out.println("Im a private method");
    }

    public static void main(String[] args) {
    	
    	Employee emp=new Employee();
    	emp.name="John";
    	emp.lastName="Smith";
    	emp.salary=9000;
    	emp.ssn=912345678;
    	//accessing all methods
    	method1();
    	emp.method2();
        emp.method3();
        emp.method4();
        
    	
    }
}
