package com.hpe.java;

public class ArrayTest2 {

	public static void main(String[] args) {

		//test2();
		int[] a = { 2, 1, 8, 9, 5 };
		int max = new ArrayTest2().getMax(a);
		int min = new ArrayTest2().getMin(a);
		System.out.println(max);
		System.out.println(min);

	}

	// 数组最值问题
	public static void test1() {

		int[] a = { 2, 1, 8, 9, 5 };// 静态初始化

		int max = a[0];
		/*
		 * for (int i = 1; i < a.length; i++) {
		 * 
		 * if(max<a[i]) { max = a[i]; }
		 * 
		 * }
		 */

		for (int i : a) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println("最大值：" + max);
	}

	public static void test2() {

		int[] a = { -1, -5, -9, 2, 1, 8, 9, 5 };// 静态初始化

		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			if (min > a[i]) {
				min = a[i];
			}

		}

		/*
		 * for (int i : a) { if (min > i) { min = i; } }
		 */
		System.out.println("最小值：" + min);
	}
	
	//方法：求数组中的最大值
	//1.参数
	//2.功能
	//3.返回值
	
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		
		
		return max;
	}
	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		
		
		return min;
	}

}
