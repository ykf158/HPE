package com.hpe.java;


//单线程：主线程一条线可以串起来，执行路径只有一条
//main就是主线程
public class MainTest {

	public static void main(String[] args) {
		
		eat();
		sleep();
		
		
	}
	
	public static void eat(){
		System.out.println("吃饭");
	}
	public static void sleep(){
		System.out.println("睡觉");
	}

}
