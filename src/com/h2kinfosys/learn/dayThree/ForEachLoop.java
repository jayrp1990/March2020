package com.h2kinfosys.learn.dayThree;

public class ForEachLoop {

	public static void main(String[] args) {
		// Array - consolidation of similar data types
		int marks[] = {79,67,89,90,50,80};
		//System.out.println(marks[6]);
		// use Simple for loop to iterate thur marks
	
		int max_index = marks.length; // Max index is length  - 1
		int totalMarks = 0;
		for(int i = 0; i < max_index;i++) {
			totalMarks = totalMarks + marks[i];
		}
		System.out.println("Total Marks :: " + totalMarks);
		
		totalMarks = 0;
		for(int eachSubMarks : marks) {
			totalMarks = totalMarks + eachSubMarks;
		}
		System.out.println("For Each Loop Result :: " + totalMarks);
	}

}
