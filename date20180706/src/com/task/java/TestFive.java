package com.task.java;

import java.util.Scanner;

public class TestFive {

	public static void main(String[] args) {
		isRunNian();
	}
	public static void isRunNian() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();
		int a = year % 4;
		int b = year % 100;
		int c = year % 400;
		if (a == 0 && b != 0 || c == 0) {
			System.out.println("闰年");
		}else {
			System.out.println("不是闰年");
		}
		
	}

}
