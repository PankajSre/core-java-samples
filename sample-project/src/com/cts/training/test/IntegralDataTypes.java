package com.cts.training.test;

public class IntegralDataTypes {

	public static void main(String[] args) {
		
		int octal = 037; // 10 ==> 001000
		System.out.println("Octal : "+octal);
		int hex = 0x22A;
		System.out.println("Hex : "+hex);
		
		int binary = 0b1010_1010_1000_1001_1010_1;
		System.out.println(binary);
		
		char ch = 65; // 65-90 [A-Z] 97-122[a-z]
		System.out.println(ch);
		
		byte b = 10;
		int a = b; // Implicit Type casting
		System.out.println(a);
		
		float f = 10.3f;
		long l = (long)f; // Explicit type casting
		System.out.println(l);
	}

}
