package com.cts.training.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] num = new int[8];

		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < num.length; i++) {

			num[i] = in.nextInt();
		}
		
//		for(int i = 0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		// Enhanced for Loop
		
		for(int a : num) {
			System.out.println(a);
		}

	}

}
