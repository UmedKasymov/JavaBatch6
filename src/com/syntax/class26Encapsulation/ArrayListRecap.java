package com.syntax.class26Encapsulation;

import java.util.ArrayList;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		//lets arraylist that stores Double type of objects
		//generic arraylist
		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		System.out.println(alist);
		
		//replace element
		alist.set(1,13.90);
		System.out.println(alist);
		
		//remove element
		alist.remove(13.90);
		System.out.println(alist);
		
	}
}
