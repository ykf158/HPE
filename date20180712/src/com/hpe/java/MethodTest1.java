package com.hpe.java;

public class MethodTest1 {

	public static void main(String[] args) {

		int a= 1;
		int b = 2;
		System.out.println("a="+a+",b="+b);
		swap(a, b);
		System.out.println("a="+a+",b="+b);
		int[] arr = {1,2,5,3,4,6,7};
		printArr(arr);
		arrPlus(arr);
		printArr(arr);
	}
	
	public static void swap(int a , int b) {
		int temp = a;
		a=b;
		b=temp;
	}
	
	public static void arrPlus(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=1;
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	
}
