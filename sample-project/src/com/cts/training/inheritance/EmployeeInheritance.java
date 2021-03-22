package com.cts.training.inheritance;

public class EmployeeInheritance {

	public static void main(String[] args) {

	}

}

class Employee {
	int id;
	String name;
	

}

class Permanent extends Employee {

	double salary;
}

class Contractual extends Employee {
	double hourlyPay;
	int contractPeriod;
}
