package com.getitdone;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<>();
		
		int maxCapacity=10;
		
		  Thread producerThread = new Thread(new Producer(queue, maxCapacity));
	      Thread consumerThread = new Thread(new Consumer(queue, maxCapacity));

	      // Start the threads
	      producerThread.start();
	      consumerThread.start();
	}
	
	

	
}
