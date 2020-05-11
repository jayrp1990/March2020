package com.h2kinfosys.learn.dayFive;

import java.util.List;

public class Customer {
	
	private String firstName;
	protected String storeName = "Customer :: Cumberland Store";
	
	public Customer() {
		System.out.println("Aweome Logic of Creating Customer");
	}
	
	// Overloaded Constructor
	public Customer(String custId) {
		// calling self constructor
		this();
		System.out.println("Customer with Customer ID :: " + custId);	
	}
	
	// Overloaded Constructor
	public Customer(int storeId) {
		this("100");
		System.out.println("Customer of Store :: " + storeId);
	}
	
	// Overloaded Constructor
	public Customer(float discount) {
		this(1121);
		System.out.println("Customer of Discount :: " + discount);
	}
	
	// Validate if zipCode is correct 
	public boolean validateCustomer(String zipCode) {
		if(zipCode != null && (!zipCode.equals(""))) {
			int length = zipCode.length();
			if(length == 5) {
				return true;
			}
		}
		return false;
	}

	// Also validate City
	// Overloading - keeping same method name with different parameter
	// Variable Name and return type doesnt matter
	// 1. Number of parameters
	// 2. Type of Parameters
	boolean validateCustomer(String zipCode, String city) {
		if(zipCode != null 
				&& (!zipCode.equals(""))
				&& city != null 
				&& (!city.equals(""))) {
			int length = zipCode.length();
			if(length == 5) {
				return true;
			}
		}
		return false;
	}
	
	// Validate Customer with mobile number
	public boolean validateCustomer(long mobileNumber) {
		if(mobileNumber > 0) {
			String mobileString = Long.toString(mobileNumber);
			int length = mobileString.length();
			if(length == 10) {
				return true;
			}
		}
		return false;
	}
	
	public final void awesomeLogicShouldNotBeOverridden() {
		System.out.println("No Override");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
