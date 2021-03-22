package com.cts.training.string;

import java.util.ArrayList;
import java.util.HashSet;

public class HashcodeAndEquals {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setId(101);
		emp2.setId(101);

		System.out.println(emp1.equals(emp2));
		
		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		System.out.println(employees);

	}

}

class Employee {
	private int id;
	private String name;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
