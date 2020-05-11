package com.h2kinfosys.learn.dayEight;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		// PriorityQueue
		PriorityQueue<String> queueOne = new PriorityQueue<String>();
		PriorityQueue<String> emptyQueue = new PriorityQueue<String>();
		// Add data
		queueOne.offer("Apple");
		queueOne.offer("Banana");
		queueOne.offer("Grapes");
		queueOne.offer("Apple");
		System.out.println("queueOne :: " + queueOne);
		System.out.println("emptyQueue :: " + emptyQueue);
		
		// get an element : peek - retrive but does not remove head of this queue
		System.out.println("queueOne.peek() :: " + queueOne.peek());
		System.out.println("emptyQueue.peek() :: " + emptyQueue.peek());
		System.out.println("queueOne after peek() :: " + queueOne);
		
		// get an element with queueOne.element() - 
		System.out.println("queueOne.element() :: " + queueOne.element());
	//	System.out.println("emptyQueue.element() :: " + emptyQueue.element());
		System.out.println("queueOne after element() :: " + queueOne);
		
		// get an element : poll() - retrives and removes head of this queue
		System.out.println("queueOne.poll() :: " + queueOne.poll()); 
		System.out.println("emptyQueue.poll() :: " + emptyQueue.poll()); 
		System.out.println("queueOne after poll() :: " + queueOne);
		
		// get an element with remove() - empty queue will give an exception
		System.out.println("queueOne.remove() :: " + queueOne.remove()); 
	//	System.out.println("emptyQueue.remove() :: " + emptyQueue.remove()); 
		System.out.println("queueOne after remove() :: " + queueOne);
	
		
	}

}
