package com.cts.training.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = in.nextInt();
//1234
		while (num > 0) {
			sum = sum + num % 10; // 1%10 = 1
			num = num / 10; // 1/10 = 0

		}
		System.out.println("The Sum of Digits is : " + sum);

	}

}
