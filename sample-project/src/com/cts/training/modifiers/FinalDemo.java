package com.cts.training.modifiers;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class FinalDemo {

	public static void main(String[] args) {

//		Employee employee = new Employee();
		PermanentEmployee pe = new PermanentEmployee();
//		employee.display();
		pe.display();
	}

}

abstract class Employee {

	public abstract void display() ;
	// Declaration of method
	public abstract void calculateSalary();
	
  // There is something which is getting definition
	
}

 class PermanentEmployee extends Employee {

	@Override
	public void calculateSalary() {
		
		System.out.println("Permanent EMployee  Salary Calculation");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}

 class ContractualEmployee extends PermanentEmployee {
	@Override
	public void calculateSalary() {
		System.out.println("Contractual Employee Salary Calculation");
	}
}