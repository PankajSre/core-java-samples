package com.cts.training.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Apple", 300);
		map.put("Banana", 50);
		map.put("Orange", 70);
		map.put("Mango", 150);
		map.put("Apple", 200);
		map.put("Grapes", 100);
		map.put("Papaya", 50);
		map.put("Plum", 10);
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
}
