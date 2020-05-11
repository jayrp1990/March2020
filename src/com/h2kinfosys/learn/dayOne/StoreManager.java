package com.h2kinfosys.learn.dayOne;

// First statement of class is always a package Name
// Writing simple English - this is not Java - Comment
public class StoreManager {

	// Single line comment
	/* This is multiline comment
	  And I can add any number of lines here */
	
	// Type of Data is being stored
	// Size of Data is being Stored 
	// Numeric type 
	// age - integer
	// Percentage - decimal number - float
	
	
	// main - ctrl+space - after suggestions - enter 
	// psvm - intellij IDEA 
	public static void main(String[] args) {
		// byte - 8 bits
		byte shoppingCartItems = 127; // Wrapper - create a Class
		short billAmount = 32000;
		int salesPerDay = 999999999; 
		long amazonSalesPerWeek = 99999999999999l;
		
		// decimal point numbers
		float taxAmount = 12.36f;
		double amountAfterDiscount = 33.4;
		
		// Character - holds a single character
		char itemCategory = 'H'; // single quotes 
		
		// Boolean Variable - can hold only true or false
		boolean isPreferredCustomer = true;
		
		// String - not a primitive data type
		String name = "Niel Armstrong";
		
		// print in console - System.out.println --> Sysout - ctrl+space
		System.out.println("byte shoppingCartItems " + shoppingCartItems);
		// Please print all the variables with message - with Sysout
	}
}

