package com.hpe.java1;

public class NewPerson {

	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "NewPerson [age=" + age + "]";
	}
}
