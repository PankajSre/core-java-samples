package com.cts.training.transfer;

public class Calculator {

	public  int div(int a, int b) {
		if (b == 0) {
			return 0;
		} else {
			return a / b;
		}
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		int div = cal.div(4,0);
		System.out.println(div);
	}

}
