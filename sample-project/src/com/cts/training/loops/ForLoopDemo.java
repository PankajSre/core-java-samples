package com.cts.training.loops;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = in.nextInt();

		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(num+" x "+ i+ " = "+(num*i));
		}

	}

}