package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class ArraySort {

	// 排序
	@Test
	public void test1S() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		System.out.println("请输入第三个数");
		int c = sc.nextInt();

		if (a > b) {
			int temp = b;
			b = a;
			a = temp;
		}
		if (b > c) {
			int temp = c;
			c = b;
			b = temp;
		}
		if (a > b) {
			int temp = b;
			b = a;
			a = temp;
		}

		System.out.println(a + " " + b + " " + c);

	}

	// 冒泡排序
	@Test
	public void test2() {
		int[] arr = { 2, 7, 6, 4, 8, 5, 3 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		new ArrayTest3().show(arr);
	}

}
