package com.cts.training.exceptions;

public class CustomExceptionDemo {
	public static void checkAge(int age) throws AgeLimit {

		if (age < 20) {
			throw new AgeLimit();
		} else {
			System.out.println("Allowed to Access this Channel");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(19);
		} catch (AgeLimit e) {
			System.out.println(e.getMessage());
		}
	}

}

class AgeLimit extends Exception {

	public AgeLimit() {

	}

	public AgeLimit(String message) {
		System.out.println("The minimum age should be 20");
	}

	public String getMessage() {
		return "Age should be 20 or more";
	}

}
