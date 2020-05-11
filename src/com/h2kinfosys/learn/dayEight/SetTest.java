package com.h2kinfosys.learn.dayEight;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// HashSet - Uses HashTable of JVM - Fastest Collection (Set)
		// DO NOT allow duplicates
		HashSet<String> hashSetTest = new HashSet<String>();
		hashSetTest.add("One");
		hashSetTest.add("Two");
		hashSetTest.add("Three");
		hashSetTest.add("Four");
		System.out.println(hashSetTest);
		// Duplicates
		System.out.println("Can I add One again ? " + hashSetTest.add("One"));
		System.out.println(hashSetTest);
		
		// remove
		hashSetTest.remove("FOur");
		
		// clear
		
		// size
		System.out.println(hashSetTest.size());
		
		// iterate
		for (String eachString : hashSetTest) {
			System.out.println(eachString);
		}
		
		if(hashSetTest.contains("One")) {
			System.out.println("Contains One");
		}
		
		// LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("Four");
		System.out.println(linkedHashSet);
		
		// TreeSet
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("Z");
		treeSet.add("E");
		
		System.out.println(treeSet);
		
		
	}

}
