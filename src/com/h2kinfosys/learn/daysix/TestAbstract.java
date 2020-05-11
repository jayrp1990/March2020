package com.h2kinfosys.learn.daysix;

public class TestAbstract {

	final static String testVar = "Sample Here";
	
	
	public static void main(String[] args) {
		// Abstract Class cannot be instantiated
		// Vehicle vehile = new Vehicle();
		// RT isN = new IT
		// testVar = "New Value";
		Vehicle car = new Car();
		car.adhereRule();
		
		Vehicle biCycle = new Bicycle();
		biCycle.rideMechanism();
		// Interfaces can be used as reference type
		Driavable driveThis = new Aeroplane();
		driveThis.drive();
	}

}
