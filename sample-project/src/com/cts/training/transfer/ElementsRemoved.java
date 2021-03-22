package com.cts.training.transfer;

import java.util.Scanner;

public class ElementsRemoved {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("No of elements");
		
		int size=sc.nextInt();
		
		
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			
				arr[i]=sc.nextInt();
			}
		
		int count=0;
		for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}
		System.out.println(count);
		}
	}