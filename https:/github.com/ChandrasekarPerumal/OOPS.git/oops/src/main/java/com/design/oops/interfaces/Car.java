package com.design.oops.interfaces;

public interface Car {
	
	void displayType();
	void model();
	abstract void owner();
	
	default void purchaseYear() {
		System.out.println("Purchase Year -- default in Interface");
	}
	
	static void insurance() {
		System.out.println("Insurance -- static in Interface");
	}
	

}
