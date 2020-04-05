package com.syntax.class22;

public class Recap {

	public void hello() {
		System.out.println("Hello");
	}
	public void hello(String name) {//This method is overloaded
		System.out.println("hello "+name);
	}
	//CE: overloading is not possible by changing access modifier 
//	private void hello(String str) {
//		System.out.println(str);
//	}
	//CE: overloading is not possible by changing return type
//	public void hello(String name) {
//		return name;
//	}
}

//IN METHOD OVERLOADING METHOD SIGNATURE MUST BE DIFFERENT 

//METHOD SIGNATURE: Method name+ parameters ONLY

//Can we overload private method?