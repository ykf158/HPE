package com.hpe.java;

public class ArrayTest1 {

	public static void main(String[] args) {

		/*test3();
		test4();*/
		test5();

	}

	// 数组遍历
	public static void test1() {
		int[] a = { 2, 4, 1, 3, 8, 7 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"   ");
		}

	}
	public static void test2() {
		
		int[] a = { 2, 4, 1, 3, 8, 7 };
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	
	public static void test3() {
		
		String[] strArray = {
				"a","b","c","d"
		};
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
	}
	public static void test4() {
		
		String[] strArray = {
				"a","b","c","d"
		};
		for (String str : strArray) {
			System.out.println(str);
		}
		
	}
	
	public static void test5() {
		Person[] person = new Person[5];
		
		/*Person zhangsan = new Person(20,"张三");
		Person lisi = new Person(21,"李四");
		Person wangwu = new Person(22,"王五");
		Person zhaoliu = new Person(23,"赵六");
		Person xiaoqi = new Person(24,"小七");*/
		
		person[0] = new Person(20,"张三");
		person[1] = new Person(21,"李四");
		person[2] = new Person(22,"王五");
		person[3] = new Person(23,"赵六");
		person[4] = new Person(24,"象牙山尼古拉斯赵四");
		
		
		for (Person p : person) {
			System.out.println(p.getName());
		}
		
	}

}
