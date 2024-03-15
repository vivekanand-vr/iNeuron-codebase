package com.getitdone.Interface;

public class Person implements IInterface {

	@Override
	public String saveName(String name) {
		
		return "Name saved-"+name;
	}

	@Override
	public String saveAddress(String addr) {
		
		return "Address saved"+addr;
	}

	@Override
	public String saveage(Integer age) {
		// TODO Auto-generated method stub
		return "Age saved "+age;
	}

}
