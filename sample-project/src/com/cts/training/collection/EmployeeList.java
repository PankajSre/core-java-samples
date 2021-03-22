package com.cts.training.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(103, "Aayan", "Hydrabad", "Development", 35000, 22);
		Employee emp2 = new Employee(101, "Aman", "New Delhi", "Digital transformation", 45000, 25);
		Employee emp3 = new Employee(105, "Mohan", "Chennai", "Design", 38000, 23);
		Employee emp4 = new Employee(102, "Thejas", "Bangalore", "Testing", 36000, 20);
		Employee emp5 = new Employee(104, "Ayesha", "Chennai", "Backend Developer", 48000, 22);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		for(Employee emp : employees) {
			System.out.println(emp); // It calls the toString() method
		}

	}

}
