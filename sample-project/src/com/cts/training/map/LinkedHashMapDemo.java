package com.cts.training.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Apple", 300);
		map.put("Banana", 50);
		map.put("Orange", 70);
		map.put("Mango", 150);
		map.put("Apple", 200);
		map.put("Grapes", 100);
		map.put("Papaya", null);
		map.put(null, 10);
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

}
