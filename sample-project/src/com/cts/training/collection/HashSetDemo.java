package com.cts.training.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Guava");
		set.add("Mango");
		set.add("Apple");
		set.add("Papaya");
		
		for(String str : set) {
			System.out.println(str);
		}
		
		Iterator<String> it = set.iterator();
		
//		ListIterator<String> lit = list.listIterator();
		
	}

}
