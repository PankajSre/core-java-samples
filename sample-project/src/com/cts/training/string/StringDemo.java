package com.cts.training.string;

public class StringDemo {

	public static void main(String[] args) {
		String message = "Cognizant Technology Solutions";
		System.out.println("Lenght : "+ message.length());
		System.out.println("Is String empty? : "+ message.isEmpty());
		System.out.println("Substring(10,20) : "+ message.substring(10, 20));
		System.out.println("Substring(10) : "+ message.substring(10));
		System.out.println("Character at index 5 : "+ message.charAt(5));
		System.out.println("Index of T : "+ message.indexOf("T"));
		System.out.println("last Index of t : "+ message.lastIndexOf("t"));
		System.out.println("String starts with: This? :"+ message.startsWith("This"));
		System.out.println("String ends with: ons? :"+ message.endsWith("ons"));
		System.out.println("Capital Letters(Upper case): "+ message.toUpperCase());
		System.out.println("lower case: "+ message.toLowerCase());
		message = message.concat(" Batch 2021");
		
//		System.out.println(message);
//		message = message.trim();
//		System.out.println(message);
		
		String[] blocks = message.split("o");
		for(String str : blocks) {
			System.out.println(str);
		}
		
		
		
		
	}

}
