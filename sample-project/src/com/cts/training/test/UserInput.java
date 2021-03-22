package com.cts.training.test;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = in.nextLine();
		System.out.println("Welcome : "+ name);
	}

}
