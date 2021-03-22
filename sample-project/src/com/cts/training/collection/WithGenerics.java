package com.cts.training.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithGenerics<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

        public static void main(String args[]){
		WithGenerics<Integer> type = new WithGenerics<>();
//		type.set("Pankaj"); 
		type.set(100);
		
		WithGenerics<String> sType = new WithGenerics<String>();
		sType.set("Hello Java");
		
		
		WithGenerics<List<String>> list = new WithGenerics<List<String>>();
		List<String> names = new ArrayList<String>(Arrays.asList("Aman","Mohan","Anjali","Ayesha"));
		list.set(names);
		
		System.out.println(type.get());
	}
}
