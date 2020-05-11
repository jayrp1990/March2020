package com.h2kinfosys.learn.dayFive;

public class TestClassReference {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// ClassName instanceName = new Constructor()
		// ReferenceType instanceName = new InstanceType()
		Customer customer2 = new PreferredCustomer();
		// Visibility of members depends on Reference Type
		customer2.validateCustomer("30080", "Macon");
		// Execution of methods is from instance type
		
		PreferredCustomer pCst = new PreferredCustomer();
		pCst.printApplicableDiscount();
	}

}
