package com.hpe.java;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {

//		test1();
//		test2();
		test3();

	}

	// break:跳出当前整个循环
	public static void test1() {

		for (int i = 0; i < 3; i++) {

			if (i == 1) {
				break;
			}

			for (int j = 0; j < 3; j++) {

				System.out.println("i=" + i + ",j=" + j);

			}

		}
	}

	public static void test2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入5个年龄");
		int sum = 0;
		int i = 0;
		for (; i < 5; i++) {
			int age = sc.nextInt();
			if (age < 0 || age > 130) {
				System.out.println("年龄输入有误");
				break;
			}
			sum += age;
		}
		if (i == 5) {
			System.out.println("平均年龄是：" + sum / 5);
		}
		
	}
	
public static void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入5个年龄");
		int sum = 0;
		int i = 0;
		boolean flag = true;
		for (; i < 5; i++) {
			int age = sc.nextInt();
			if (age < 0 || age > 130) {
				flag = false;
				break;
			}
			sum += age;
		}
		if (flag) {
			System.out.println("平均年龄是：" + sum / 5);
		}else {
			System.out.println("年龄输入有误");
		}
		
	}
}
