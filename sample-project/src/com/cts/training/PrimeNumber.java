package com.cts.training;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = in.nextInt();

		boolean checkPrime = isPrime(num);
		System.out.println("is the number prime? : " + checkPrime);

	}    

	private static boolean isPrime(int num) { //  15
		boolean prime = true;
		for (int i = 2; i <= num/2; i++) {//2 3 4 5 6 7 

			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;

	}

}
