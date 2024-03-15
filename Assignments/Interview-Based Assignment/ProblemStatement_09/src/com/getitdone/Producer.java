package com.getitdone;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
	
	public final Queue<Integer> queue;
	public final int maxCapacity;
	
	

	public Producer(Queue<Integer> queue, int maxCapacity) {
		super();
		this.queue = queue;
		this.maxCapacity = maxCapacity;
	}



	@Override
	public void run() {
		Random random=new Random();
		while(true) {
			
			synchronized (queue) {
				if(queue.size()==maxCapacity) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				  int number = random.nextInt(100);
	                queue.add(number);
	                System.out.println("Produced: " + number);
	                
	                queue.notify();
			     
			     try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}

	}

}
