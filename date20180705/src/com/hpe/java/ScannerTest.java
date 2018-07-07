package com.hpe.java;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入折扣：");
		double discount = sc.nextDouble();
		int tPrice = 245;
		int wPrice = 570;
		int wpPrice = 320;
		double tPay = tPrice * discount;
		double wPay = wPrice * discount;
		double wpPay = wpPrice * discount;
		boolean tBool = tPay < 100;
		boolean wBool = wPay < 100;
		boolean wpBool = wpPay < 100;
		System.out.println("T恤折扣价低于100吗？"+tBool);
		System.out.println("网球鞋折扣价低于100吗？"+wBool);
		System.out.println("网球拍折扣价低于100吗？"+wpBool);
		
	}

}
