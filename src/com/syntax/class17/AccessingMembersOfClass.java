package com.syntax.class17;

public class AccessingMembersOfClass {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Faisal";
		emp.lastName="Sakhi";
		emp.salary=10000;
		//emp.ssn=98798708;//cause its a private modifier.CE:field ssn is not visible
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.methood4();//CE: method4 is not visible
		
	}

}
