package com.syntax.Assignments9;

public class A140 {
	/*Complete the Employee.java class:
	
	Include the following class variables:
	* name(String)
	* lastName(String)
	* employeeId(int)
	* startDate(String)
	* salary(int)
	
	
	Write two constructors:
	
	* non-argument constructor
	* parameterized constructor that will initialize all instance variables
	
	Create two different objects of the Employee class using both constructors and print 
	the values of the properties inline using a print method.
	
	
	Output:
	 
	null null 0 null 0
	Joe Smith 12345 01/01/1970 35000
	 * 
	 */
	String name, lastName, startDate;
	int employeeId, salary;
	
	A140(){
		System.out.println();
	}
	A140(String name, String lastName, int employeeId, String startDate, int salary){
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	public void printDetails() {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
	public static void main(String[] args) {
		A140 emp=new A140();
		emp.printDetails();
		A140 emp1=new A140("Joe", "Smith",12345,"01/01/1970", 35000);
	}
}
