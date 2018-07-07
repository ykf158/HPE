package com.task.java;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		calculator();
	}

	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请逐个输入算式，回车分隔");
		double a = sc.nextDouble();
		sc.nextLine();
		char b = sc.nextLine().charAt(0);
		double c = sc.nextDouble();
		double result = 0.0;
		switch (b) {
		case '+':
			result = a + c;
			break;
		case '-':
			result = a + c;
			break;
		case '*':
			result = a + c;
			break;
		case '/':
			result = a + c;
			break;
		default:
			System.out.println("运算符输入错误，请重试");
			break;
		}
		System.out.println("result=" + result);
	}

}
