
package com.cts.training.test;
import java.util.Scanner;
public class OperatorsDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int marks = in.nextInt();
		if(marks>=0 && marks <30) {
			System.out.println("Apply for Improvement!");
		}
		else if(marks>=30 && marks <45) {
			System.out.println("Average Score!");
		}
		else if(marks>=45 && marks<70) {
			System.out.println("Good Score");
		}
		else if(marks>=70 && marks <85) {
			System.out.println("Excellent Score");
		}
		else if(marks>=85 && marks <=100) {
			System.out.println("Extra ordinary Score");
		}
		else {
			
			System.out.println("Please enter a Score b/w 0-100");
		}
		
	}

}


/*
 0-30  ==> Fail, Apply the improvement
 30-45 ==> average
 45-70 ==Good
 70-85 == Excellent
 85-100 == Extra Ordinary
*/