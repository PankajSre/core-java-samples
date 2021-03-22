package com.cts.training.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("Apple", 300);
		map.put("Banana", 50);
		map.put("Orange", 70);
		map.put("Mango", 150);
		map.put("Apple", 200);
		map.put("Grapes", 100);
		map.put("Papaya", 50);
		map.put("Plum", 10);
		
		System.out.println(map);
	}

}
