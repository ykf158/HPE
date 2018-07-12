package com.hpe.java1;

public class Person {

	// 属性
	int age;
	String name;
	char sex;

	// 方法

	// 吃饭
	public void eat() {
		System.out.println("eating......");
	}
	
	public void sayHello() {
		System.out.println("hello , my name is "+name);
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
