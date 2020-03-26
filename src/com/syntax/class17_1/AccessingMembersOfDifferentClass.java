package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccessingMembersOfDifferentClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee.title="QA Engineer";
		emp.name="Ahmet";
		//below variables not available due to restrictions
		//emp.lastName="";-->protected(within the package)
		//emp.salary=;-->default(within the package)
		//emp.ssn--->private
		
		Employee.method1();
		emp.method1();
		//below variables not available due to restrictions
		//emp.method2();-->protected
		//emp.method3();-->default
		//emp.method4();--->private

	}
}
