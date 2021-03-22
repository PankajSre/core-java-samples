package com.cts.training.arrays;

import java.util.Scanner;

public class TwoDimensionsArray {

	public static void main(String[] args) {
//		int[][] arr = new int[2][];
//		 arr[0] = new int[3]; 
//		 arr[1] = new int[4];
//		 
//		 arr[1][3] = 20;
//		 System.out.println(arr[1][3]);

//		int[][][] arr = new int[2][][];
//		arr[0] = new int[3][];
//		arr[1] = new int[4][];
//		
//		arr[0][0] = new int[3];
//		arr[0][1] = new int[4];
//		arr[0][2] = new int[3];
//		
//		
//		arr[1][0] = new int[2];

		int[][] arr = new int[3][3];

		Scanner in = new Scanner(System.in);
		// for Row
		for (int row = 0; row < 3; row++) {
			// Columns in a row
			for (int col = 0; col < 3; col++) {

				arr[row][col] = in.nextInt();
			}

		}
		
		System.out.println("The 2-d elements are:");
		
		for (int row = 0; row < 3; row++) {
			// Columns in a row
			for (int col = 0; col < 3; col++) {

				System.out.print(arr[row][col]+ "  ") ;
			}
			System.out.println();

		}

	}

}
