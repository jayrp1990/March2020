package com.h2kinfosys.learn.dayFour;

public class AccessModifiers {

	public String publicString = "Accessible To Everyone";
	private String privateString = "Accessible to Only You";
	protected String protectedString = "Accessible to Inheritance & Package";
	String defautString = "Accessible within Package";
	

	
	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		System.out.println(access.publicString);
		System.out.println(access.privateString);
		System.out.println(access.protectedString);
		System.out.println(access.defautString);
		

	}

}
