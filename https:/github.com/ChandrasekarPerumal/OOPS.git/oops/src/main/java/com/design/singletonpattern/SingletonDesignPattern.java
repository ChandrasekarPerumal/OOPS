package com.design.singletonpattern;

public class SingletonDesignPattern {

	private static SingletonDesignPattern designPattern;
	
	// Private constructor restricts
	private SingletonDesignPattern() {
		
	}
	
	
	public static SingletonDesignPattern getSingletonDesign() {
		
		if(designPattern == null) {
			designPattern = new SingletonDesignPattern();
		}
		
		return designPattern;
	}
	
	
	public void display() {
		System.out.println(" Singleton Design Pattern ");
	}	
	
	
}

