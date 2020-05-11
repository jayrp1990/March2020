package com.h2kinfosys.learn.daySeven;

public class LocalClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void simpleSum(int one, int two) {
		int sum = 0;
		// Create a class within Method  - Local CLasses
		class DoOperations{
			
			int addTwoNumbers(int first, int second) {
				return (first+second);
			}
			
			int multiplyTwoNumbers(int first, int second) {
				return (first * second);
			}
		}
		
		DoOperations operations = new DoOperations();
		sum = operations.addTwoNumbers(one, two);
		int multiplication = operations.multiplyTwoNumbers(one, two);
		
		
	}
}
