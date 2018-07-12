package com.hpe.java;

import java.util.Arrays;

import org.junit.Test;


public class ArraySort {

	public void test1() {
		int[] arr = { 3, 1, 0, 5, 2 };
		// 从小到大

		//四不像排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// 选择排序
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}

		}

		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
	@Test
	public void test2() {
		
		int[] arr = { 2,1,3,6,4};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
