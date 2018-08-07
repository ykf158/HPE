package com.hpe.java;

//Thread常用方法
//1.start();启动线程并调用相应的run()方法
//2.run():子线程要执行的代码放到run()方法中
//3.currentThread():静态方法，得到当前的线程名
//4.getName():获取线程的名字
//5.setName():设置线程的名字
//6.yield():调用此方法的线程将释放当前cpu的执行权
//7.join():在A线程调用B线程的join方法 ，当执行到此方法，A线程停止执行，直到B线程执行完毕，A线程再接着join之后的代码执行
//8.isAlive():当前进程是否存活
//9.sleep(long l):让当前进程睡眠l毫秒
//10.wait(),notify(),/notifyAll()-->Object
//11.getPriority()-->得到当前线程的优先级
//12.setPriority(int)-->设置当前线程的优先级（1-10）,默认是5-->CPU获取资源的额概率
//
class MyThread1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			/*try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getName() + i);

		}

	}

}

public class ThreadTest2 {

	public static void main(String[] args) {

		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		m1.setName("线程1");
//		m2.setName("线程2");
		m1.start();
//		m2.start();
		Thread.currentThread().setName("主线程");

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getName() + i);
			/*if (i % 10 == 0) {
				Thread.currentThread().yield();
			}*/
			
			/*try {
				if (i==20) {
					m1.join();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		
		System.out.println(m1.isAlive());

	}

}
