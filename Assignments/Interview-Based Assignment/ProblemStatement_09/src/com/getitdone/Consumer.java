package com.getitdone;

import java.util.Queue;
import java.util.Random;

class Consumer implements Runnable {
    private final Queue<Integer> queue;
    private final int maxCapacity;

    public Consumer(Queue<Integer> queue, int maxCapacity) {
        this.queue = queue;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                // Wait if the queue is empty
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Retrieve a number from the queue and calculate the sum
                int number = queue.poll();
                int sum = calculateSum();

                System.out.println("Consumed: " + number);
                System.out.println("Sum: " + sum);

                // Notify the producer thread
                queue.notify();

                // Sleep for a random interval
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int calculateSum() {
        int sum = 0;
        for (int num : queue) {
            sum += num;
        }
        return sum;
    }
}
