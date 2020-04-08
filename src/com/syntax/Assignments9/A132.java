package com.syntax.Assignments9;

public class A132 {

	/*For you to do:
		
		In AnotherClass declare a private, default, protected, public methods and have 
		them each return the name of the what access modifier they are using.
		All methods should be accessible by class name
		
		Call methods of Another class inside Main class
		
		Expected Output:
		default
		protected
		public
	 * 
	 */
	
	
	private void method1(){
		System.out.println("private");
	}
	        void method2() {
		System.out.println("default");
	}
	protected void method3() {
		System.out.println("protected");
	}
	public void method4() {
		System.out.println("public");
	}
 
		public static void main(String args[]){
			A132 obj = new A132();
			
	    	obj.method2();
	        obj.method3();
	        obj.method4();
			}
	}
