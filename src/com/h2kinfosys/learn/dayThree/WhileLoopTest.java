package com.h2kinfosys.learn.dayThree;

public class WhileLoopTest {

	public static void main(String[] args) {
		// Add 1 to 10 with while loop
		/*
		 * while(condition){
		 * 		block of code will be executed if condition is true
		 * }
		 * if condition is false, jump out of loop
		 */
		int iterator = 11;
		int total = 0;
		while(iterator <= 10) {
			total = total + iterator;
			iterator++; 
		}
		System.out.println("Came out of loop :: Iterator :: " + iterator);
		System.out.println("Total is :: " + total);
	}

}
