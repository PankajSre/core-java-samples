package com.cts.training.loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = in.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(num + " x " + i + " = " + (num * i));
			i = i + 1;
		}

	}
}
