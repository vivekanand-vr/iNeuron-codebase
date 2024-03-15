package com.getitdone;

public class Main {

	public static void main(String[] args) {
		Thread t1=new Thread(new EvenClass());
		Thread t2=new Thread(new OddClass());
		t1.start();
		t2.start();  
		

	}

}
