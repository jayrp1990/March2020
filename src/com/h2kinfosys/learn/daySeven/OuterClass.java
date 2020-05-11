package com.h2kinfosys.learn.daySeven;

public class OuterClass {
	
	private String instanceVar = "OuterClass :: Instance Variable";
	private static String staticVar = " OuterClass :: Static Variable";
	
	public void instanceMethod() {
		System.out.println(" instanceMethod :: " + instanceVar);
		System.out.println(" instanceMethod :: " + staticVar);
	}
	
	public static void staticMethod() {
		System.out.println(" staticMethod :: " + staticVar);
	}
	
	// Inner CLass - Non static Inner class
	class NonStaticInnerClass {
		private String innerClassInstanceVariable = " NonStaticInnerClass ::  Instance Variable";
		private final static String nonStaticInnerClassStaticVar = " NonStaticInnerClass :: Static Variable";
		// NonStaticInnerClass cannot have StaticVar unless its final
		
		public void innerClassInstanceMethod() {
			System.out.println(" innerClassInstanceMethod :: " + instanceVar);
			System.out.println(" innerClassInstanceMethod :: " + staticVar);
			System.out.println(" innerClassInstanceMethod :: " + innerClassInstanceVariable);
			System.out.println(" innerClassInstanceMethod :: " + nonStaticInnerClassStaticVar);
		}
		/*
		public static void innerClassStaticMethod() {
			
		}*/
		
	}
	
	// Static Inner Class
	static class StaticInnerClass {
		private String staticInnerClassInstanceVariable = " StaticInnerClass ::  Instance Variable";
		private static String staticInnerClassStaticVar = " StaticInnerClass :: Static Variable";
		
		public void staticInnerClassInstanceMethod() {
		//	System.out.println(" innerClassInstanceMethod :: " + instanceVar);
			System.out.println(" staticInnerClassInstanceMethod :: " + staticVar);
			System.out.println(" staticInnerClassInstanceMethod :: " + staticInnerClassInstanceVariable);
			System.out.println(" staticInnerClassInstanceMethod :: " + staticInnerClassStaticVar);
		}
		
		public static void staticInnerClassStaticMethod() {
			//System.out.println(" staticInnerClassStaticMethod :: " + instanceVar);
			System.out.println(" staticInnerClassStaticMethod :: " + staticVar);
			//System.out.println(" staticInnerClassStaticMethod :: " + staticInnerClassInstanceVariable);
			System.out.println(" staticInnerClassStaticMethod :: " + staticInnerClassStaticVar);

		}
		
	}
	
	

}
