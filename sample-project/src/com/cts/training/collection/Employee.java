package com.cts.training.collection;

public class Employee extends Object {

	private int id;
	private String name;
	private String address;
	private String department;
	private double salary;
	private int age;

	// Default Constructor
	public Employee() {
	}

	// Parametrized constructor
	public Employee(int id, String name, String address, String department, double salary, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	// getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department
				+ ", salary=" + salary + ", age=" + age + "]";
	}
	
	

}
