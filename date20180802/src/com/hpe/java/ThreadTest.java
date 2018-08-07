package com.hpe.java;

//实现多线程的方式一：继承java.lang.Thread类
//创建一个子线程，在子线程中打印1-100的数，同时在主线程的也做同样的动作

//1.创建一个继承自Thread类的子类

class MyThread extends Thread{
	
	//2.重写run()方法，run()方法中就是子线程中要完成的功能
	
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	
	}
	
}


public class ThreadTest {

	public static void main(String[] args) {

		//3.创建Thread子类的对象
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		//4.启动子线程，调用run()方法
		m1.start();
		m2.start();
		
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		
		
	}

}
