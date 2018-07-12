package com.hpe.java;

import org.junit.Test;

public class MultiArray {
	
	@Test
	public void test1() {
		int[][] a = new int[5][];
		a[0] = new int[5];
		a[1] = new int[5];
		a[2] = new int[5];
		a[3] = new int[5];
		a[4] = new int[5];
		
		
	}
	
	@Test
	public void test2() {
		//动态初始化
		int[][] arr  = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[5];
		System.out.println(arr[3].length);
		
		//静态初始化
		int[][] arr1 = {{1,2,3,4},{4,5,5,6},{7,8,9}};
		
	}
	@Test
	public void test3(){
		int[][] arr = {{1,2,3,4},{4,5,5,6},{7,8,9}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void test4() {
		int[][] arr = {{1,2,3,4},{4,5,5,6},{7,8,9}};
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	
	
}
