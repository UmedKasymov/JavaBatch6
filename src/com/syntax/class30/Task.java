package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {

	/*Create a map of countries with its capital that will store countries in alphabetical order.
	 * 
	 * Print all keys and values from a country map using for each loop and iterator.
	 * 
	 * Print all values from a country map using for each loop and iterator.
	 */																																							
	
	public static void main(String[] args) {
		Map<String, String> capital=new TreeMap();
		
		capital.put("USA", "Washington DC");
		capital.put("Russian", "Moscow");
		capital.put("Tajikistan", "Dushanbe");
		capital.put("Poland", "Warsaw");
		capital.put("Kyrgyzstan", "Bishkek");
		capital.put("Uzbekistan", "Tashkent");
		
		System.out.println(capital.keySet());
		System.out.println(capital.values());
		
		for(String a:capital.keySet()) {
			System.out.println("Keys:"+a);
		}
		for(String b:capital.values()) {
			System.out.println("Values:"+b);
	}
		Iterator<String>it1=capital.keySet().iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		Iterator<String>it2=capital.values().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
			
    }
  }
}