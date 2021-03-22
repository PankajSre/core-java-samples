package com.cts.training;

public class Calculator {

	public int first;
	int second;
	public static void main(String[] args) {
		int firstNumber = 30;
		int secondNumber = 20;
		// Object Creation

		Arithematic arithematic = new Arithematic();

		int sum = arithematic.addNumbers(firstNumber, secondNumber);

		System.out.println("The Sum is : " + sum);

		int sub = arithematic.subNumbers(firstNumber, secondNumber);

		System.out.println("The Sutraction is : " + sub);
	}
	
}

class Arithematic {

	public int addNumbers(int first, int second) {

		return first + second;
	}

	public int subNumbers(int first, int second) {

		return first - second;
	}

	public int multiplyNumbers(int first, int second) {

		return first * second;
	}

	public int divideNumbers(int first, int second) {

		return first / second;
	}
}

