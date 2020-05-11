package com.h2kinfosys.learn.dayNine;

public class TestException {

	public static void main(String[] args) {
		System.out.println("Line 1");
		
		int marks = 400;
		int total = 10;
		
		/*	try{
		 * 		// risky code
		 *  }catch(ArithmeticException e){
		 *  	// Block of code if exception occurs
		 *  }
		 */
		// Separate block for separate risk
		try {
			float percent = marks / total;
			String studentName = "David";
			System.out.println("Percent :: " + percent + " Student Name :: "+ studentName.trim());
			int testMarks = Integer.parseInt("A123");
			System.out.println("Percent :: " + percent + " Student Name :: "+ studentName.trim() + " test marks " + testMarks);
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("NullPointerException :: " + e.getMessage());
		}catch(Exception nex) {
			System.out.println("handled with generic exception " + nex.getMessage());
			nex.printStackTrace();
		} // Specific First Generic Last
	
		try {
			int[] something = {1,2,3,4};
			System.out.println(something[0]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This block will execute regardless I get exception or not");
		}
		
		
		// Here compiler checks if you wrote try catch
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		TestException test = new TestException();
		try {
			test.ageValidation(20);
		} catch (AgeValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of Program");

	}
	
	
	public boolean ageValidation(int age) throws AgeValidationException {
		if(age < 0 || age >121) {
			System.out.println("Invalid Age");
			// thorw - an exception programatically
			throw new AgeValidationException("Invalid Age " + age);
		}
		return true;
	}
	
	

}
