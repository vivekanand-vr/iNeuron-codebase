package com.getitdone;

public abstract class Abstract {
	
	public Abstract() {
		System.out.println("Abstract class constructor..");
	}
	
	public abstract void printAlphabets();
	
	public void printNubers(int n) {
		for(int i=0;i<n;i++) {
        System.out.println(i);	
		}
	}

}
