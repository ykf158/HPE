package com.hpe.java;


public class ArrayTest {

	public static void main(String[] args) {

		test2();
		
	}
	
	public static void test1() {
		
		String[] strs = {
				"qew","asd","zxc"
		};
		System.out.println(strs[1]);
	}
	
	
	public static void test2() {
		//动态初始化，在初始化的时候只指定数组的长度（数组种元素的个数），由系统来分配初始值
		String[] strs = new String[5];
		System.out.println(strs.length);
		for (String str : strs) {
			System.out.println(str);
		}
	}

}
