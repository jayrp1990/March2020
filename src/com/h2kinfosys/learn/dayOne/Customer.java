package com.h2kinfosys.learn.dayOne;

public class Customer {
	// Instance variable
	// Instance --> Object
	String name;
	int custId;
	int age;
	String zipCode;
	char gender;
	// StoreName - which is not related to instance
	static String storeName = "Best Buy Inc";
	
	public static void main(String[] args) {
		// Instance of CUstomer 
		// ClassName instanceName = new ClassName();
		Customer custOne = new Customer();
		custOne.name = "David";
		custOne.custId = 100;
		custOne.age = 45;
		custOne.gender = 'M';
		// Static Variables do not need instance to access it
		// Class Variables
		Customer.storeName = "Walmart Inc";
		
		Customer custTwo = new Customer();
		custTwo.name = "Niel";
		
		System.out.println("custOne.name :: " + custOne.name);
		System.out.println("custTwo.name :: " + custTwo.name);
		// Static Variable
		System.out.println("custOne.storeName :: " + Customer.storeName);
		System.out.println("custTwo.storeName :: " + Customer.storeName);
		
	}
}
