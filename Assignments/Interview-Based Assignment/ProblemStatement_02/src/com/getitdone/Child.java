package com.getitdone;

public class Child extends Parent {
	static {
		System.out.println("Child class .class file loading");
	}
	public Child() {
		super();
		System.out.println("Child class constructor called parent class constructor.");
	}

}
