package com.syntax.class29CollectionAndInterface;

import java.util.*;

public class Task02 {



	public static void main(String[] args) {
		/*/Create a Set of cities in which you want to make sure that insertion order is maintained. 
		 * Using Iterator remove any city that starts with "A";
		 */
		Set<String> cities=new LinkedHashSet<>();
		cities.add("New York");
		cities.add("San Francisco");
		cities.add("Paris");
		cities.add("Washington DC");
		cities.add("Baltimore");
		cities.add("Alberta");
		System.out.println(cities);
		Iterator<String> city=cities.iterator();
		while(city.hasNext()) {
			if(city.next().startsWith("A")) {
				city.remove();
			}
		}
		System.out.println(cities);
	}
}