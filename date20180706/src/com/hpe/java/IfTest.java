package com.hpe.java;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

//		test1();
//		test2();
//		test3();
//		gradeCompare();
//		test4();
//		numSort();
//		test5();
		test6();
	}

	public static void test1() {
		// 接受控制台输入的整数，如果大于0，就打印？大于0

		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);

		// 接受控制台输入的整数并保存
		System.out.println("请输入一个整数");
		String strNum = sc.nextLine();
		int num = Integer.parseInt(strNum);

		// 如果num大于0，就打印num大于0
		if (num > 0) {
			System.out.println(num + "大于0");

		}
	}

	public static void test2() {
		// 从控制台输入两个整数，如果相等打印相等，否则打印不相等

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("两个数相等");
		} else {
			System.out.println("两个数不相等");

		}
	}

	public static void test3() {
		// if-else if
		// 从控制台输入两个整数，并保存a,b。如果a>b,打印a大于b，如果a等于b,打印a等于b,否则打印a小于b

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + "大于" + b);
		} else if (a == b) {
			System.out.println(a + "等于" + b);
		} else {
			System.out.println(a + "小于" + b);
		}
	}

	public static void gradeCompare() {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		int a = sc.nextInt();

		if (a >= 80) {
			System.out.println("成绩优秀");
		} else if (a >= 60) {
			System.out.println("成绩合格");
		} else if (a < 60) {
			System.out.println("成绩不合格");
		} else {
			System.out.println("成绩输入不正确");
		}
	}

	public static void test4() {
		// if-else if
		// 从控制台输入两个整数，并保存a,b。如果a>b,打印a大于b，如果a等于b,打印a等于b,否则打印a小于b

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();

		if (a >= b) {
			if (a > b) {
				System.out.println(a + "大于" + b);
			} else {
				System.out.println(a + "等于" + b);
			}
		} else {
			System.out.println(a + "小于" + b);
		}
	}

	public static void numSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();
		System.out.println("请输入第三个数");
		int num3 = sc.nextInt();
		
		if(num1 > num2) {
			// num1 num2
			if (num3 > num1) {
				//num3 num1 num2
				System.out.println(num3+">"+num1+">"+num2);
			}else if (num3 < num2) {
				//num1 num2 num3
				System.out.println(num1+">"+num2+">"+num3);
			}else {
				//num1 num3 num2
				System.out.println(num1+">"+num3+">"+num2);
			}
		}else {
			//num2 num1
			if (num3 > num2) {
				//num3 num2 num1
				System.out.println(num3+">"+num2+">"+num1);
			}else if (num3 < num1) {
				//num2 num1 num3
				System.out.println(num2+">"+num1+">"+num3);
			}else {
				//num2 num3 num1
				System.out.println(num2+">"+num3+">"+num1);
			}
		}
			 
	}
	
	public static void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();
		int x = 100;
		switch (a) {
		case 1:
			x+=5;
			break;
		case 2:
			x+=10;
			break;
		case 3:
			x+=16;
			break;
		case 4:
			x+=34;
			break;
		default:
			x+=100;
			break;
		}
		System.out.println(x);
	}

	public static void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int score = sc.nextInt();
		int a = score/10;
		switch (a) {
		case 10:
		case 9 :
			System.out.println("成绩等级A");
			break;
		case 8:
		case 7:
			System.out.println("成绩等级B");
			break;
		case 6 :
			System.out.println("成绩等级C");
			break;
		default:
			System.out.println("成绩等级D");
			break;
		}
		
	}
}
