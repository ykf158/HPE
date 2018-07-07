package com.task.java;

import java.util.Scanner;

public class TestSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("请输入一个浮点数");
		double d = sc.nextDouble();
		double a = d*10%10;
		int num = 0;
		if (a>=5) {
			num = (int)d+1;
		} else {
			num = (int)d;
		}
		System.out.println("近似值为"+num);
	}

}
