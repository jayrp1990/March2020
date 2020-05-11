package com.h2kinfosys.learn.dayFive;

public class TestInheritance {

	public static void main(String[] args) {
		PreferredCustomer pCust = new PreferredCustomer();
		System.out.println(pCust.storeName);
		pCust.validateCustomer("30080", "Smyrna");
	}

}
