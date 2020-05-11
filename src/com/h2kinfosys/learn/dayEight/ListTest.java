package com.h2kinfosys.learn.dayEight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// Two core implementation of List Interface
		// Stores element in Indexed / positional - just like array
		// ArrayList
		ArrayList<String> colors = new ArrayList<String>();
		// Add Element 
		colors.add("red");
		colors.add(1 , "blue");
		colors.add("yellow");
		System.out.println(colors);
		colors.add(2, "brown");
		colors.add("violet");
		colors.add("green");
		colors.add("indigo");
		//  java.lang.IndexOutOfBoundsException
		// colors.add(60, "Something");
		
		// remove element
		colors.remove(0);
		colors.remove("red");
		System.out.println(colors);
		
		// getting an element 
		String posTwo  = colors.get(2);
		System.out.println("Position 2 :: " + posTwo);
		
		// contains
		if (colors.contains("yellow")) {
			System.out.println("It has Yellow");
		}
		
		// Size of collection
		int size = colors.size();
		System.out.println("Size :: " + size);
		
		// Iteration
		for(String eachColor : colors) {
			System.out.println(eachColor);
		}
		
		//colors.clear();
		//System.out.println("colors.clear() " + colors);
	
		// Create a Sublist
		List<String> fewColors = colors.subList(2, 6); // fromIndex - inclusive toIndex = excluded
		System.out.println(fewColors);
		
		// LinkedList - remembers Order of insertion
		LinkedList<String> colorsLinkedList = new LinkedList<String>();
		// Assignment - add all methods for testing
	}

}
