package com.h2kinfosys.learn.daysix;

public class Car extends Vehicle implements Driavable{
	
	@Override
	public void rideMechanism() {
		System.out.println("Car rides on 4 wheels and Mechanical Engine");
		
	}

	@Override
	public void adhereRule() {
		System.out.println("Car Rules defined by DMV");	
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	

}
