package com.h2kinfosys.learn.dayEight;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// HashMap - Key Value Pair
		Map<Integer, String> hashMapTest = new HashMap<Integer, String>();
		// add element 
		hashMapTest.put(100, "Apple");
		hashMapTest.put(200, "Grapes");
		hashMapTest.put(300, "Bananas");
		hashMapTest.put(400, "Pineapple");
		System.out.println(hashMapTest);
		// get element 
		String value = hashMapTest.get(300);
		System.out.println(value);
		// remove
		hashMapTest.remove(100);
		hashMapTest.remove(100, "Apple");
		
		// replace a value
		hashMapTest.put(200, "Anything");
		System.out.println("replace a value :: " + hashMapTest);
		// Iterate
		Set<Integer> keyset = hashMapTest.keySet();
		for (int eachKey : keyset) {
			System.out.println("Key :: " + eachKey + " Value :: " + hashMapTest.get(eachKey));
		}
		
		Collection<String> valueCollection = hashMapTest.values();
		for (String eachValue : valueCollection) {
			System.out.println(eachValue);
		}
		
		// Contains 
		if(hashMapTest.containsKey(100)) {
			System.out.println("Has 100 as Key");
		}
		
		if(hashMapTest.containsValue("Pineapple")) {
			System.out.println("Has Pineapple");
		}
		
		// Size 
		System.out.println("Size :: " + hashMapTest.size());
		// clear 
		hashMapTest.clear();
		
		
		// LinkedHashMap
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// add element 
		linkedHashMap.put(100, "Apple");
		linkedHashMap.put(200, "Grapes");
		linkedHashMap.put(300, "Bananas");
		linkedHashMap.put(400, "Pineapple");
		System.out.println(linkedHashMap);
	}

}
