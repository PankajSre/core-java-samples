package com.cts.training.test;

import java.util.Date;

public class SwitchDemo {

	public static void main(String[] args) {

		Date date = new Date();
		
		
		int day = date.getDay();

		switch (day) {

		case 0:
			System.out.println("Sunday--End of Weekend!");
			break;
		case 1:
			System.out.println("Monday--Weekday Start");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday- Last day of Week");
			break;
		case 6:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Please enter a number b/w 0-6");

		}
	}

}
