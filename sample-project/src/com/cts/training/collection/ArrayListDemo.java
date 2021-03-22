package com.cts.training.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Welcome");
		list.add(2021);
		list.add(true);
		list.add(32.50);
		
		
		
		list.add(1,"Java");
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println("is list empty? : "+ list.isEmpty());
		System.out.println("is true available in the list ? : "+ list.contains(true));
		System.out.println("List Size : "+ list.size());
		System.out.println("remove an Element ? : "+ list.remove("Java"));
		
		ArrayList list1 = new ArrayList(Arrays.asList(11,22,33,44));
		
		list.addAll(2,list1);
		
		System.out.println(list);
		list.clear();
		
		System.out.println(list);
		
	}

}
