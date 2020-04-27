package com.syntax.class29CollectionAndInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. 
	 * Using 2 different ways retrieve all elements from set. 
	 * 
	 * Create a Set of cities in which you want to make sure that insertion order is maintained. 
	 * Using Iterator remove any city that starts with “A”;
	 *  
	 * Create a Set collection that will hold Objects of Student Type. In this set we do not 
	 * care about the insertion order. Each student object should have name and studentID. Display
	 * name of each student.
	 * 
	 */
		
	public class SetCollection {
		public static void main(String[] args) {
			Set<String> countries = new TreeSet<>();
			countries.add("Russia");
			countries.add("USA");
			countries.add("Japan");
			countries.add("Spain");
			countries.add("Italy");
			countries.add("Belarus");
			Iterator<String> x = countries.iterator();
			while (x.hasNext()) {
				System.out.print(x.next() + " ");
			}
			System.out.println();
			for (String y : countries) {
				System.out.print(y + " ");
			}
		}
	}

