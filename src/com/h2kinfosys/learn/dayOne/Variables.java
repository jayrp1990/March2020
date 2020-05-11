package com.h2kinfosys.learn.dayOne;

public class Variables {
	// Instance Variables - Directly defined under class
	// here initial value is not defined
	String name; // null
	int age; // 0
	float tax; // 0.0f
	char someChar; // ASCII 0
	boolean somebool; // false
	
	
	public static void main(String[] args) {
		// Local Variable - Defined in method - has boundry of method and needs default value
		int localInt = 100;
		System.out.println(localInt);
	}
	
	public void testInstance() {
		int newLocalInt;
		//System.out.println("localInt from main method " + localInt);
		System.out.println("name :: " + name);
		System.out.println("age :: " +age);
		System.out.println("tax :: " +tax);
		System.out.println("someChar :: " +someChar);
		System.out.println("somebool :: " +somebool);
	}
	
	
	

}
