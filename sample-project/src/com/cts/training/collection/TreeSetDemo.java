package com.cts.training.collection;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
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
		
	
	}
}
