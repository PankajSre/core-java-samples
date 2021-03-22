package com.cts.training.test;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		boolean vowel = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ch");
		char ch = in.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			vowel = true;
		}
		if (vowel == true) {
			System.out.println("is vowel");
		} else if (vowel == false) {
			System.out.println("is consonnt");
		}
	}

}
