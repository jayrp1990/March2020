package com.h2kinfosys.learn.dayTwo;

import java.util.Calendar;

public class SwitchCase {

	public static void main(String[] args) {
		// Problem - Store Price fetch batch runs at different time on different days
		
		int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("Today is :: " + dayOfWeek);
		String dayOfWeekStr = "Monday";
		
		
		switch(dayOfWeek) {
			case 7:
			case 4:{
						System.out.println("Price Fetch Batch Runs at 7:30 AM");
						break;
					}
			case 1:
			case 2: 
			case 3:{
						System.out.println("Price Fetch Batch Runs at 8:00 AM");
						break;
					}
		
			case 5: {
						System.out.println("Price Fetch Batch Runs at 8:30 AM");
						break;
					}
			case 6: {
						System.out.println("Price Fetch Batch Runs at 9:00 AM");
						break;
					}
			default: {
						System.out.println("default : Price Fetch Batch Runs at 8:00 AM");
						break;
					}
		}
		System.out.println("Batch Trigger Complete");
		
	}

}
