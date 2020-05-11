package com.h2kinfosys.learn.daysix;

public abstract class Vehicle  {
	
	public Vehicle() {
		System.out.println("Abstract Class Constructor can only be called from Child Class Constructor");
	}

	private String someVariable = "Some Value";
	
	public abstract void rideMechanism();
	
	public abstract void adhereRule();
	
	public void printVehicleName(String name) {
		System.out.println("This Vehicle is :: " + name);
	}
}
