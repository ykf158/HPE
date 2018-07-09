package com.hpe.java;

public class ForTest {

	public static void main(String[] args) {
		test4();
	}

	public static void test1() {
		int i = 0;
		while (i++ < 10) {
			System.out.println("i love you" + i);
		}
	}

	public static void test2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i love you" + (i + 1));
		}
	}

	// 死循环
	public static void test3() {
		for (int i = 0;; i++) {
			System.out.println("i love you" + (i + 1));
		}
	}

	// 水仙花数
	public static void test4() {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 100; i <= 999; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println(i);
			}
		}
	}
}
