package com.h2kinfosys.learn.dayTwo;

public class LogicalOperators {

	public static void main(String[] args) {
		int firstVar = 200;
		int secondVar = 100;
		int thirdVar = 1000;
		// Comparison Operators - leads boolean result
		System.out.println("Greater than > :: " + (firstVar > secondVar));
		System.out.println("Greater than or equals >= :: " + (firstVar >= secondVar));
		System.out.println("Less than < :: " + (firstVar < secondVar));
		System.out.println("Less than or equals <= :: " + (firstVar <= secondVar));
		System.out.println("Equals to == :: " + (firstVar == secondVar));
		System.out.println("Not Equals != :: " + (firstVar != secondVar));
		
		String firstName = "David";
		String lastName = "david";
		boolean result = (firstName.equalsIgnoreCase(lastName));
		System.out.println("(firstName == lastName) :: "+ result);
		
		// Find the greatest number from three variable
		// Logical Operators - AND, OR, NOT
		// AND

		/*
		 * Truth Table of AND
		 * Stat1	Stat2		S1 & S2
		 *   T		  T				T
		 *   T		  F				F
		 *   F		  T				F
		 *   F		  F				F
		 */
		boolean logicalResult = (firstVar > secondVar) && (firstVar > thirdVar);
		System.out.println("compOne & compTwo :: " + logicalResult);
		
		/*
		 * Truth Table of OR
		 * Stat1	Stat2		S1 || S2
		 *   T		  T				T
		 *   T		  F				T
		 *   F		  T				T	
		 *   F		  F				F			
		 */
		boolean logicalOrResult = (firstVar > secondVar) || (firstVar > thirdVar);
		System.out.println("compOne || compTwo :: " + logicalOrResult);
		/*
		 * Truth Table of NOT
		 * Stat1	!S1
		 *   T		  F				
		 *   F		  T				
		 */
		boolean testVar = true;
		System.out.println("Not testVar " + !testVar);
		

	}

}
