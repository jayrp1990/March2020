package com.h2kinfosys.learn.dayTwo;

public class Conditions {

	public static void main(String[] args) {
		// Problem 1 - Find greater number of two
		int firstNumber = 100;
		int secondNumber = 2000;
		int thirdNumber = 300;
		int fourthNumber = 400;
		
		boolean result = firstNumber > secondNumber;
		System.out.println("Result :: " + result);
		
		/*
		 * if (condition) {
		 * 		this block of code is executed if condition is true
		 * }else {
		 * 		this block of code is executed if condition is false 
		 * }
		 */
		if(firstNumber > secondNumber) {
			System.out.println("first number is greater :: " + firstNumber);
		}else {
			System.out.println("Second number is greater :: " + secondNumber);
		}
		
		// Problem 2 - Find Biggest number out of 3
		if((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
			System.out.println("first number is greater :: " + firstNumber);
		}else if (secondNumber > thirdNumber) {
			System.out.println("Second number is greater :: " + secondNumber);	
		}else {
			System.out.println("Third number is greater :: " + thirdNumber);	
		}
		
		// Problem 3 - Assignment - Find the biggest number from 4 numbers 
	}

}
