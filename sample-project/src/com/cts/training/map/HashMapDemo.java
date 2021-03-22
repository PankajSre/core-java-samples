package com.cts.training.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 300);
		map.put("Banana", 50);
		map.put("Orange", 70);
		map.put("Mango", 150);
		map.put("Apple", 200);
		map.put("Grapes", 100);
		map.put("Papaya", 20);
//		System.out.println(map.get("Orange"));
//		System.out.println(map.containsKey("Hello"));
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+ " ==> "+entry.getValue());
		}
		
		
	}

}
