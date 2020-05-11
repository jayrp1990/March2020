package com.h2kinfosys.learn.dayThree;

import com.h2kinfosys.learn.dayFour.AccessModifiers;

public class ChildAccessTest extends AccessModifiers {

	
	public static void main(String[] args) {
		ChildAccessTest access = new ChildAccessTest();
		System.out.println(access.publicString);
	//	System.out.println(access.privateString);
		System.out.println(access.protectedString);
	//	System.out.println(access.defautString);
	}
}
