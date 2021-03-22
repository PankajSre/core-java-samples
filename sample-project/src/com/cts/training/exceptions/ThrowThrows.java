package com.cts.training.exceptions;

public class ThrowThrows {

	public static void div(int a, int b) throws ArithmeticException {
        // 1. Throw the exception to the called method by using throws
		// 2. I want to handle it here only
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println("The Division is : " + (a / b));
		}
	}

	public static void main(String[] args) {

		try {
			div(10,2);
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero");
		}
	}

}
