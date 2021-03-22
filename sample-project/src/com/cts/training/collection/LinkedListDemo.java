package com.cts.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("2001");
		list.add("2001");
		list.add("Aman");
		list.add("Aayan");
		list.add("20");
		list.add(2010);
		list.add(30.50);
		list.add(true);
		

//		System.out.println(list);
//		
//		for(Object obj : list) {
//			System.out.println(obj);
//		}

//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}

//		ListIterator lit = list.listIterator();
//
//		System.out.println("*******Forward Direction*********");
//
//		while (lit.hasNext()) {
//			System.out.println(lit.next());
//		}
//
//		System.out.println("*******Backward Direction*********");
//
//		while (lit.hasPrevious()) {
//			System.out.println(lit.previous());
//		}

		// Run time Exception
		for (Object obj : list) {
			String str = (String) obj; // ClasscastException with the Integer
			if(str.equals("Hello")) {
				System.out.println("Find!!!");
			}
			System.out.println(str);
		}
		
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(200);
//		myList.add("Hello");

	}

}
