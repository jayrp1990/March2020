package com.h2kinfosys.learn.dayTen;

public class Task implements Runnable{
	
	public Task(int i) {
		System.out.println("Task Number :: " + i);
	}

	@Override
	public void run() {
		// Activity which is provided to all threads
		System.out.println("Additing 1 to 10 " + Thread.currentThread().getName());
		int total = 0;
		for (int i = 0; i < 10; i++) {
			//System.out.println("Value of i " + Thread.currentThread().getName());
			total = total + i;
		}
		System.out.println("Total :: " + total + " By " + Thread.currentThread().getName());
		//printTotal(total);
		/*
		try {
			System.out.println(Thread.currentThread().getName() + " Time Before Sleep " + Calendar.getInstance().getTime()); 
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " Time After Sleep " + Calendar.getInstance().getTime());
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		Thread.dumpStack();
		*/
	}

	
	public  void printTotal(int total) {
		System.out.println("Value of total :: " + total);
		synchronized(this) {
			total = total + 100;
			System.out.println(Thread.currentThread().getName() + "holdlock :: " + Thread.holdsLock(this));
		}
		System.out.println("New Value of total :" + total);
		
	}
}
