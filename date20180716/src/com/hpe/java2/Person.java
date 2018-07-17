package com.hpe.java2;

//多态:同一种事物的多种表现形态
//java中多态性主要体现
public class Person {

	private int age;

	private static int legs;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getLegs() {
		return legs;
	}

	public static void setLegs(int legs) {
		Person.legs = legs;
	}

	public void eat() {
		System.out.println("eating");
	}

}
