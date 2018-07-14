package com.hpe.java;

public class Dog extends Animal{
	
	//子类特有的属性
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//子类特有的方法
	public void watchDoor() {
		System.out.println("看门");
	}
	
}
