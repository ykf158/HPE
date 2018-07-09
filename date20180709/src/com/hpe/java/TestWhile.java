package com.hpe.java;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
		test6();

	}

	public static void test1() {
		int i = 2;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
	}

	public static void test2() {
		int i = 1;
		int zSum = 0;
		int fSum = 0;
		Scanner sc = new Scanner(System.in);
		while (i != 0) {
			i = sc.nextInt();
			if (i > 0) {
				zSum++;
			} else if (i < 0) {
				fSum++;
			}
		}
		System.out.println("正" + zSum + "负" + fSum);
	}

	public static void test3() {
		int i = 1;
		int sum = 0;
		do {
			sum += i;
		} while (i++ < 100);
		System.out.println(sum);
	}

	public static void test4() {
		int i = 1;
		do {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		} while (i++ < 100);
	}

	public static void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void test6() {
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}

}
