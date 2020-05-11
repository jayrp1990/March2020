package com.h2kinfosys.learn.dayTen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 20; i++) {
			Task task = new Task(i);
			service.execute(task);
		}

	}

}
