package com.h2kinfosys.learn.dayTwo;

public class TestSimpleOperators {

	public static void main(String[] args) {
		
		int firstVar = 200;
		int secondVar = 100;
		int total = firstVar + secondVar;
		// Basic Operators
		System.out.println("Addition " + total);
		System.out.println("Subtraction " + (firstVar - secondVar));
		System.out.println("Multiplication " + (firstVar * secondVar));
		System.out.println("Division " + (firstVar / secondVar));
		System.out.println("Modulus " + (firstVar % secondVar));
		
		// increment operators var++ --> Use and increase 
		System.out.println("Increase by One ++ Operator (Var = Var +1) :: " + (firstVar++));
		System.out.println(firstVar);
		// increment operator ++var --> Increase and use
		System.out.println("Increase by One : ++Var :: " + (++secondVar));
		
		// Assignment - Use similar operator for --
		
	}
	
	

}
