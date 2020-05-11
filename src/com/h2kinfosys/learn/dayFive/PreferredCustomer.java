package com.h2kinfosys.learn.dayFive;

public class PreferredCustomer extends Customer {
	
	String storeName = "PreferredCustomer :: Cumberland Store";
	
	// Compiler can only call default - no arg constructor of Parent
	public PreferredCustomer() {
		super();
		System.out.println("PreferredCustomer Constructor");
	}
	

	
	// Validate Method - ZipCode and City with Google Maps
	/*
	 * Same method with different logic in Child Class- Overriding
	 * Rule of Overriding
	 * 1. Access Modifier - Cannot reduce the visibility but you may increase visibility  overriding
	 * 2. Return type - return type should be compatible / co-variant
	 * 3. Method Name - should be exactly same
	 * 4. Parameters/ arguments - exactly same
	 * 5. Method Body - different 
	 * 6. Exception - Co-varient
	 */
	
	@Override
	public boolean validateCustomer(String zipCode, String city)  {
		boolean result = super.validateCustomer(zipCode, city);
		System.out.println(super.storeName);
		System.out.println(storeName);
		System.out.println("PreferredCustomer validateCustomer Google Map Validation ");
		return result;
	}
	
	public void printApplicableDiscount() {
		System.out.println("Preferred Customer Discount is : 10%");
	}
	
	/*
	@Override
	public void awesomeLogicShouldNotBeOverridden() {
		super.awesomeLogicShouldNotBeOverridden();
		System.out.println("Child is able to override");
	} */

}
