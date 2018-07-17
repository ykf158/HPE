package com.hpe.java;

public class Student extends Person{

	private String number;//学号

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public void study() {
		super.study();
		System.out.println("好好学习");
	}

	public Student(String number) {
		super();
		this.number = number;
	}
	
	
}
