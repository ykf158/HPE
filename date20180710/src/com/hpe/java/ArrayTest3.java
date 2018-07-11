package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class ArrayTest3 {

	// 数组元素逆序
	public void test1() {

		int[] a = { 1, 2, 3, 4, 5 };
		show(a);
		int[] b = reOrder(a);
		System.out.println("\n逆序输出");
		show(b);

	}

	/**
	 * @category 遍历数组
	 * @param Array
	 */

	public void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

	/**
	 * @category 逆序排列
	 * @param Array
	 * @return Array
	 */

	public int[] reOrder(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

	// 交换

	public void test2() {
		int a = 1;
		int b = 2;
		System.out.println("a:" + a + ",b:" + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("a:" + a + ",b:" + b);
	}

	// 数组元素查找
	@Test
	public void test4() {
		int[] a = { 1, 2, 3, 4, 5, 5, 4, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的值");
		int s = sc.nextInt();
		int index = -1;
		int i = 0;
		for (; i < a.length; i++) {
			if (a[i] == s) {
				index = i;
				System.out.println("该数值的索引为" + i);
				break;
			}
		}
		if (i == a.length) {
			System.out.println("该数值不存在");
		}
	}

}
