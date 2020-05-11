package com.h2kinfosys.learn.daySeven;

public class TestInnerClasses {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.instanceMethod();
		OuterClass.staticMethod();
		
		OuterClass.NonStaticInnerClass nonStatInnerClas 
			= new OuterClass().new NonStaticInnerClass();
		
		nonStatInnerClas.innerClassInstanceMethod();
		
		OuterClass.StaticInnerClass staticInnerClass  
				= new OuterClass.StaticInnerClass();
		
		staticInnerClass.staticInnerClassInstanceMethod();
		OuterClass.StaticInnerClass.staticInnerClassStaticMethod();
		

	}

}
