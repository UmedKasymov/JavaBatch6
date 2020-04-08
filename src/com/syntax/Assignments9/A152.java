package com.syntax.Assignments9;

public class A152 {

	/*
	 * Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
		In main method execute all 3 methods to match the output:
		 
		Expected Output
		40 (should come from subtracting 4 numbers)
		30 (should come from subtracting 3 numbers)
		20 (should come from subtracting 2 numbers)
	 */
	void subt(int i, int x) {
		System.out.println(i-x);
	}
    void subt(int i, int x, int y) {
		System.out.println((i-x)-y);
	}
    void subt(int i, int x, int y, int z) {
	   System.out.println((i-x)-(y-z));
    }

    public static void main(String[] args) {
	
    	subs(100,20, )
   }
}