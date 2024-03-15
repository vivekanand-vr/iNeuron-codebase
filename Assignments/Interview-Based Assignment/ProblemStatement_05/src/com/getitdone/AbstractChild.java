package com.getitdone;

public class AbstractChild extends Abstract {
	
	
	public AbstractChild() {
		System.out.println("Child class constructor..");
	}

	@Override
	public void printAlphabets() {
		System.out.println("a,b,c,d,e,.....z");

	}

}
