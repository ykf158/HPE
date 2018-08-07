package com.hpe.java1;


//创建多线程的第二种方式：实现Runnable接口
//创建一个子线程：子线程中打印100之间的数
//创建一个实现Runnable接口的类
class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
}

public class RunnableTest {

	public static void main(String[] args) {

		MyThread2 m1 = new MyThread2();
		Thread t1 = new Thread(m1);
		t1.start();
		
		
	}

}
