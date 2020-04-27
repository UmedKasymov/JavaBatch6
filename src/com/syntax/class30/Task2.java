package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

	/*
	 * Create a map of Best Buy store. Place
	 * item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	 * 
	 * Retrieve all keys and values from a Best Buy map using EntrySet.
	 */
	public static void main(String[] args) {
		
		
		Map<Integer, String> bestbuy = new TreeMap<>();
		
		bestbuy.put(11345, "TV");
		bestbuy.put(12346, "Laptop");
		bestbuy.put(12444, "Printer");
		bestbuy.put(19347, "Sound System");
		
		Set<Entry<Integer,String>>buy=bestbuy.entrySet();
		System.out.println(buy);
		Iterator<Entry<Integer, String>>it=buy.iterator();
		while(it.hasNext()) {
			Entry<Integer,String>e=it.next();
			String keyval=e.getKey()+":::"+e.getValue();
			System.out.println(keyval);
	}
  }
}
