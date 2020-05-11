package com.h2kinfosys.learn.daySeven;

public class TestAnnomyousInnerClass {

	public static void main(String[] args) {
		String variable = "Some Value";
		
		Readable emailReader = new Readable() {
			
			@Override
			public void readMessage(String message) {
				System.out.println("Print message received :: " + message);
				System.out.println(variable);
				
			}
		};
	}

}
