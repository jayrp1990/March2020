package com.h2kinfosys.learn.dayFour;

public class PackageAccessTest {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		System.out.println(access.publicString);
		//System.out.println(access.privateString);
		System.out.println(access.protectedString);
		System.out.println(access.defautString);

	}

}
