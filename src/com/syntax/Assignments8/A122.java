package com.syntax.Assignments8;

public class A122 {

	/*For you to do:
	 * 
	 * Create a variable that will hold the count of all instances of the Main class
	 * 
	 * Create 3 Object of the class and print value of the count variable;
	 * 
	 * Expected Output: 
	 * 3
	 */
	static int count;
	public static void main(String[] args) {
		A122 obj1 = new A122();
		count++;
		A122 obj2 = new A122();
		count++;
		A122 obj3 = new A122();
		count++;
		System.out.println(count);
	}
}

