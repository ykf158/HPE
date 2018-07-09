package com.hpe.java;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		test7();
	}

	// 课文抄10遍--顺序
	public static void test1() {
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
		System.out.println("good good study,day day up ");
	}

	// 课文抄10遍--while
	public static void test2() {
		int i = 0;
		while (i < 10) {
			System.out.println("good good study,day day up " + (i + 1));
			i++;
		}
	}

	// 从控制台输入打印次数
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入打印次数");
		int count = sc.nextInt();
		int i = 0;
		while (i < count) {
			System.out.println("good good study,day day up " + (i + 1));
			i++;
		}
	}

	// 使用while循环打印100以内4的倍数
	public static void test4() {
		int i = 4;
		while (i <= 100) {
			System.out.println(i);
			i += 4;
		}
	}

	// 求婚
	public static void test5() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			// 求婚
			System.out.println("嫁给我吧,同意扣1，不同意接着扣1");
			i = sc.nextInt();
			if (i != 1) {
				System.out.println("再想想");
			}
		} while (i != 1);
		System.out.println("户口本带了吗,领证去");
	}
	
	// 求婚
	public static void test6() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean flag = true;
		do {
			// 求婚
			System.out.println("嫁给我吧,同意扣1，不同意接着扣1");
			i = sc.nextInt();
			if (i != 1) {
				System.out.println("再想想");
			}else {
				flag = false;
			}
		} while (flag);
		System.out.println("户口本带了吗,领证去");
	}

	//登录
	public static void test7() {
		String username;
		String password;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("请输入用户名");
			username = sc.nextLine();
			System.out.println("请输入密码");
			password = sc.nextLine();
			if ("admin".equals(username)&&"111".equals(password)) {
				flag = false;
			}else {
				System.out.println("请重新输入");
			}
			
		} while (flag);
		System.out.println("登录成功");
	}

}
