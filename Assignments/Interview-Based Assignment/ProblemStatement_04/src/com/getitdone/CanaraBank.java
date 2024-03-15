package com.getitdone;

public class CanaraBank implements IBank {
	private Float money;
	
      
	public CanaraBank() {
	
	}

	@Override
	public String deposit(Float money) {
		
		return "Amount deposited "+money;
	}

	@Override
	public String withdrawal(Float money) {
		// TODO Auto-generated method stub
		return "Amount withdrawed is "+money;
	}

}
