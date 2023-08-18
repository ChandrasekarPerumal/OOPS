package com.design.oops.polymorphism;

public class Employee extends Accounts {

	// Compile-time polymorphism or static polymorphism
	/* Method overloading */
	
	// Run-time polymorphism

	
	
	public void corporateEmployee() {

	}

	public void corporateEmployee(int id) {

	}

	public void corporateEmployee(int id, String name) {

	}

	public void corporateEmployee(String name, int id) {

	}

	public void corporateEmployee(String department) {

	}
	
	// Runtime polymorphism
	@Override
	public void display() {
		
	}
	
	public static void main(String  []arg) {
		Employee employee = new Employee();
		
		employee.display();
 	}

}
