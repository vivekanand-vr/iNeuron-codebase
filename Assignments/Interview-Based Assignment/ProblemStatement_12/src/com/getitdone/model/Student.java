package com.getitdone.model;

public class Student {
	
	private Integer id;
	private String name;
	private String address;
	private Integer age;
	public Student(Integer id,String name, String address, Integer age) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Student(String name, String address, int age) {
		// TODO Auto-generated constructor stub
super();
		
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
