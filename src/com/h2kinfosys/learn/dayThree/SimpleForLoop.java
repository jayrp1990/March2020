package com.h2kinfosys.learn.dayThree;

public class SimpleForLoop {

	public static void main(String[] args) {
		// Add 1 to 10 with for loop
		/*
		 * for(initialization, condition, increment){
		 * 		block of code executes till condition is valid
		 * }
		 */
		int total = 0;
		for(int iterator = 1; iterator <= 10; iterator++) {
			total = total + iterator;
		}
		System.out.println("Total :: " + total);
	}

}
