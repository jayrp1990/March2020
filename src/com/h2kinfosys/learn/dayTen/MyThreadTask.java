package com.h2kinfosys.learn.dayTen;

public class MyThreadTask extends Thread {

	
	@Override
	public void run() {
		System.out.println("Thread Tasks");
	}
	
	@Override
	public synchronized void start() {
		System.out.println("This is MyThreadTask start method");
		super.start();
	}
}
