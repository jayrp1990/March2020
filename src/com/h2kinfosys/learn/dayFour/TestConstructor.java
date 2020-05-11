package com.h2kinfosys.learn.dayFour;

public class TestConstructor {
	
	// Constructor is a method but 
	/*
	 * 1. Name exactly matches classname
	 * 2. Do not have return type
	 */
	public TestConstructor(String param) {
		System.out.println("This is Test Constructor :: " + param);
	}
	
	public static void main(String[] args) {
		// ClassName instanceName = new Constructor()
		TestConstructor testOne = new TestConstructor("testOne");
		TestConstructor testTwo = new TestConstructor("testTwo");
		Customer cust = new Customer("100");
	}

	

}
