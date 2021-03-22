package com.cts.training.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
//		System.out.println("Initial Capacity sb- : "+ sb.capacity()); //16
		
//		StringBuffer sb1 = new StringBuffer("CTS");
//		System.out.println("Initial Capacity sb1- : "+ sb1.capacity()); // 19
//		
//		StringBuffer sb2 = new StringBuffer(100);
//		System.out.println("Initial Capacity sb2- : "+ sb2.capacity());
//		sb.append("This is Java class");
//		System.out.println("New Capacity sb- : "+ sb.capacity());
//		sb.append(" in the CTS Batch 2021");
//		System.out.println(" Again New Capacity sb- : "+ sb.capacity());
//		System.out.println(sb);
//		sb.insert(5, "day ");
//		System.out.println(sb);
//		sb.delete(5, 9); // End index is not included
//		System.out.println(sb);
//		
//		sb.replace(5, 7, "was");
//		System.out.println(sb);
//		sb.ensureCapacity(200);
//		System.out.println(sb.capacity());
//		int a = 10;
//		
		System.out.println(sb instanceof StringBuffer);
		
	}

}
