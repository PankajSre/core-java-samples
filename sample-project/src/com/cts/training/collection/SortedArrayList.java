package com.cts.training.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Python");
		list.add("Java");
		list.add("C Programming");
		list.add("JavaScript");
		list.add("Scala");
		list.add("Ruby");
		System.out.println("Before Sorting");
		for(String lang: list) {
			System.out.println(lang);
		}
		
		System.out.println("After Sorting");
		Collections.sort(list);
		for(String lang: list) {
			System.out.println(lang);
		}
		
	}

}
