package com.h2kinfosys.learn.dayThree;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		// Add 1 to 10 with Do While
		/*
		 *do {
		 * 		block of code will be executed if condition is true
		 * }while(condition)
		 * execute block of code and then check the condition
		 */
		int iterator = 11;
		int total = 0;
		do {
			total = total + iterator;
			iterator++; 
		}while(iterator <=10);
		
		System.out.println("Came out of loop :: Iterator :: " + iterator);
		System.out.println("Total is :: " + total);
	}

}
