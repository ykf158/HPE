package com.hpe.java2;

public class Woman extends Person{

	//重写Person的eat方法
	@Override
	public void eat() {
		System.out.println("女人吃饭要狼吞虎咽");
	}
	
	public void makeup() {
		
		System.out.println("makeuping...");
		
	}
	
}
