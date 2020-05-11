package com.h2kinfosys.learn.dayThree;

import com.h2kinfosys.learn.dayFour.AccessModifiers;

public class OutsidePackageAccessTest {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		System.out.println(access.publicString);
	//	System.out.println(access.privateString);
	//	System.out.println(access.protectedString);
	//	System.out.println(access.defautString);

	}

}
