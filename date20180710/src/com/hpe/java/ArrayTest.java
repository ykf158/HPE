package com.hpe.java;

public class ArrayTest {

	public static void main(String[] args) {

		test4();

	}

	public static void test1() {

		int[] a = new int[5];

		System.out.println(a[0]);
		System.out.println(a[a.length - 1]);

		int[] b = new int[5];
		System.out.println(a == b);
		
		System.out.println(a[0] == b[0]);
		
		b = a;
		System.out.println(a == b);

	}
	
	public static void test2() {
		//静态初始化
		int[] a = new int[] {1,2,3};
		int[] b = {1,2,3};
	}
	
	public static void test3() {
		int[] a  = {1,2,3};
		int[] b  = {1,2,3};
		System.out.println(a == b);
		
		int[] c = new int[3];
		c = new int[4];
		System.out.println(c[3]);
		
		
		/*int[] d = new int[4];
		d = new String[5];*/
		
		int[] e = new int[3];
		e[1] = 1;
	}
	
	
	public static void test4() {
		/*int[] a = new int[] {1,2,3};
		System.out.println(a[3]);*/
		
		
		String[] b = new String[3];
		char ch = b[0].charAt(0);
		System.out.println(ch);
		
		
	}
	

}
