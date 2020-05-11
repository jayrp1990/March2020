package com.h2kinfosys.learn.dayFive;

public class WalgreenStore {

	public static void main(String[] args) {
	
		/* Customer custOne = new Customer(5.7f);
		System.out.println(custOne.validateCustomer(null));
		System.out.println(custOne.validateCustomer("33639", "Tampa"));
		System.out.println(custOne.validateCustomer(404331101l));*/
		
		//PreferredCustomer pCustOne = new PreferredCustomer();
		//System.out.println(pCustOne.validateCustomer("30080", "Atlanta"));
		
		WalgreenStore store = new WalgreenStore();
		Customer customerObject = store.createSampleCustomer("1001");
		System.out.println(customerObject.validateCustomer(324239048098l));
		
	}
	
	public Customer createSampleCustomer(String custId) {
		Customer cust = new Customer(custId);
		return cust;
	}

	
	
}
