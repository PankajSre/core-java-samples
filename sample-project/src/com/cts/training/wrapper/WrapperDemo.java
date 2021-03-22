package com.cts.training.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
//		int age = 20;
//		// Primitive to Object
//		Integer i = Integer.valueOf(age);
//		System.out.println(i instanceof Integer);
//		
//		// Object to primitive
//		int x = i.intValue();
//		System.out.println(x);
//		
//		float f = 20.50f;
//		// Primitive to Object
//		Float obj = Float.valueOf(f);
//		System.out.println(obj instanceof Float);
//		
//		// Object to primitive
//		float y = obj.floatValue();
		
		// Auto Boxing
		char c = 'a';
		Character ch = c;
		System.out.println(ch instanceof Character);
		
		// Auto Un Boxing
		Character chr = 'd';
		char x = chr;
		
		
		String str = "110";
		Integer i = Integer.valueOf(str);
		System.out.println(i);
	}

}
