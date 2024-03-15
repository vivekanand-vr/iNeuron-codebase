package com.getitdone;

public class OddClass implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i < 10; i++) {

			if (i % 2 != 0) {
				System.out.println(i + "---Thread name:" + Thread.currentThread().getName());
			}
		}
	}

}
