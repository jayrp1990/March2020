package com.h2kinfosys.learn.dayTen;

public class ThreadTester {

	public static void main(String[] args) throws InterruptedException {
		// Thread - class helps to create threads in JAVA
		Task task = new Task(1);
		// Thread is created with Thread instance
		Thread threadOne = new Thread(task);
		Thread threadTwo = new Thread(task);
		Thread threadThree = new Thread(task);
		Thread threadDaemon = new Thread(task);
		// setting name
		threadOne.setName("threadOne");
		threadTwo.setName("threadTwo");
		threadThree.setName("threadThree");
		threadDaemon.setName("threadDaemon");
		
		// Setting priority
		threadOne.setPriority(Thread.MIN_PRIORITY); // 1 
		threadTwo.setPriority(Thread.NORM_PRIORITY);// 5
		threadThree.setPriority(Thread.MAX_PRIORITY);// 10
		threadDaemon.setDaemon(true);
		// Starts the thread - task.run() method
		threadOne.start(); 
		threadTwo.start();
		threadThree.start();
		threadDaemon.start();
		if(threadOne.isAlive()) {
			System.out.println("threadOne isalive");
		}
		 // Joins the thread with main
		threadTwo.join();
		threadOne.join();
		System.out.println("Threads have completed their tasks");
		
		/*
		 * MyThreadTask myTask = new MyThreadTask();
			myTask.start();
		 */
	}

}
