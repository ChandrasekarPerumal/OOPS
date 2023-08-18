package com.design.singletonpattern;

public class SingletonMain {

	public static void main(String []ar) {
		SingletonDesignPattern designPattern = SingletonDesignPattern.getSingletonDesign();
		designPattern.display();
	}
	
}
