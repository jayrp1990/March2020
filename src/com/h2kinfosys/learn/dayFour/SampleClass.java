package com.h2kinfosys.learn.dayFour;

public class SampleClass {

	public static void main(String[] args) {
		// CLassName instanceName = new ClassName()
		SampleClass sampleInstance = new SampleClass();
		// Calling methods
		String ageMessage = sampleInstance.ageValidation(-11);
		System.out.println(ageMessage);
		SampleClass.printCompanyName(); // you do not need instance for static methods
	}
	
	// Methods in Class - Functions 
	/*
	 * 1. Access Modifier
	 * 2. Return type - Any Object in Java or void (single object only)
	 * 3. Method Name - camelCase - elaborated, logical
	 * 4. Input - Parameters - Arguments in () - any number of arguments
	 * 5. Method Body {} - return statement if method is not void
	 * 6. Exception - if method is throwing any exception - add throws
	 */
	public String ageValidation(int age) {
		String message = null;
		// this is where you will write validation code
		if(age < 0 || age > 121) {
			message = "Invalid Human Age";
		}else {
			message = "Valid Human Age";
		}
		return message;
	}
	
	public static void printCompanyName() {
		System.out.println("Best Buy Inc");
	}
}
