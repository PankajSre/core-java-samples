package com.cts.training;

public class MethodOverriding {

	public static void main(String[] args) {

		Manager manager = new Manager();
		System.out.println("Salary: " + manager.salary());
		System.out.println("Leave Count: " + manager.leaveCount());
		Developer developer = new Developer();
		System.out.println("Salary: " + developer.salary());
		System.out.println("Leave Count: " + developer.leaveCount());
		System.out.println("Age : "+ developer.getAge());
		
		Manager mgr = new Developer(); // Late Binding-run time- dynamic
		System.out.println("Salary: " + mgr.salary());
		System.out.println("Leave Count: " + mgr.leaveCount());
		
	}

}

class Manager {

	public double salary() {
		return 123456.0;
	}

	public int leaveCount() {
		return 20;
	}
	 int getAge() {
		return 21;
	}
}

class Developer extends Manager {
	@Override
	public double salary() {
		return 50000.00;
	}
    @Override
	public int leaveCount() {
		return 15;
	}
    
    
}
