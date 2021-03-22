package com.cts.training.constructors;

public class Employee {
// Instance Variables
	int id;
	String name;
	
	Employee(){
		System.out.println("It will be called Automatically!!!");
	}
	Employee(int ids, String names){
		id = ids;
		name = names;
	}
	
	public void display() {
		System.out.println(id+ "  "+name);
	}
}
