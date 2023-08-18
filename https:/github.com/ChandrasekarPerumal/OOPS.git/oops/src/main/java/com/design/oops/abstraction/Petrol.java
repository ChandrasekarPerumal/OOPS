package com.design.oops.abstraction;

public abstract class Petrol {

	final int types = 4;
	int price = 100;

	abstract void petrolType();

	// Constructor
	Petrol() {
		System.out.println("Constructor Petrol");
	}
	
	final void productionCompany() {
		System.out.println("Production company");
	}

}
