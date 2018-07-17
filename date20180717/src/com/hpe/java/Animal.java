package com.hpe.java;



//abstract
public abstract class Animal {

	
	//属性
	
	private int age;
	private String sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	//方法
	public void shout() {
		System.out.println("shouting...");
	}
	
	
	
	
}
