package com.cts.training.arrays;

import java.util.Scanner;

public class ArrayCalculations {

	public static int sumOfDiagonals(int[][] arr, int row, int column) {
		int diag_sum = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j) {
					diag_sum = diag_sum + arr[i][j];
				}
			}
		}
		return diag_sum;
	}

	public static void sumOfColumns(int[][] arr, int row, int column) {
		int col_sum = 0;

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				col_sum = col_sum + arr[j][i];

			}
			System.out.println("The Sum of " + (i + 1) + " Column is :" + col_sum);
			col_sum = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Enter Array Elements \n2. Display Array Elements\n3."
				+ "Display Sum of Rows\n4. Sum of Diagonals\n5. Sum of Columns\n6. Exit");
		System.out.println("Enter your Choice: ");
		int choice = sc.nextInt();
		System.out.println("Enter Row Count: ");

		int row = sc.nextInt();
		System.out.println("Enter Column Count: ");

		int column = sc.nextInt();
		// Declar an Array
		int arr[][] = new int[row][column];
		
		switch (choice) {
		case 1:
			inputArrayElements(arr, row, column);
			break;
		case 2:
			displayArrayElements(arr, row, column);
			break;
		case 3:
			displaySumOfRows(arr, row, column);
			break;
		case 4:
			int sum = sumOfDiagonals(arr, row, column);
			System.out.println("The Sum of Diagonals is : " + sum);
		case 5:
			sumOfColumns(arr, row, column);
			break;
		case 6:
			System.out.println("Thank You!");
			System.exit(0);
		default:
			System.out.println("Please Enter a Choice betwee 0-6");
		}

	}

	public static void inputArrayElements(int[][] arr, int row, int column) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

	}

	public static void displaySumOfRows(int[][] arr, int row, int column) {
		int sum = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println("Sum of " + (i + 1) + " Row  is :" + sum);
			sum = 0;
		}

	}

	private static void displayArrayElements(int[][] arr, int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}