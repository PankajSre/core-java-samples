package com.cts.training.transfer;

import java.util.Scanner;

public class ArraysDemo {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements :");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int count = Arr1(array, size);
		System.out.println(count);
	}

	public static int Arr1(int[] array, int size) {
		int max = array[0], min = array[0], count1 = 0, count2 = 0;
		int x=0;
		for (int i = 0; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("max : "+max);
		for (int j = 0; j < size; j++) {
			if (array[j] == max)
				count1++;
		}
		System.out.println("max count : "+count1);
		for (int i = 0; i < size; i++) {
			if (array[i] < min)
				min = array[i];

		}
       System.out.println("min : "+min);
		for (int j = 0; j < size; j++) {
			if (array[j] == min)
				count2++;
		}
		System.out.println("min count : "+count2);
		if (count1 == count2) {
			x = 1;
		} else {
			x = 0;
		}

		return x;
	}
}