package com.hpe.java;

public class Person {

	private int age;
	private String sex;
	private String name;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public Person() {
		System.out.println("无参构造函数");
	}
	public Person(int age, String sex, String name) {
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	//学习
	public void study() {
		System.out.println("studying...");
	}
	
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", sex=" + sex + ", name=" + name + "]";
	}
	
	
}
