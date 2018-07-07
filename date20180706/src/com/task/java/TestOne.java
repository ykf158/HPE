package com.task.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.矩形  2.三角形  3.圆");
		System.out.println("请选择图形");
		int sec = sc.nextInt();		
		switch (sec) {
		case 1:
			rectangle();
			break;
		case 2:
			triangle();
			break;
		case 3:
			round();
			break;
		default:
			System.out.println("输入错误，请重试！");
			break;
		}
		
	}
	public static void rectangle() {
		//矩形方法
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入矩形的高");
		double x = sc.nextDouble();		
		System.out.println("请输入矩形的宽");
		double y = sc.nextDouble();
		System.out.println("该矩形的面积为:" + (x*y));
	}
	public static void triangle() {
		//三角形方法
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三角形的底边长");
		double x = sc.nextDouble();		
		System.out.println("请输入三角形的高");
		double y = sc.nextDouble();
		System.out.println("该矩形的面积为:" + (0.5*x*y));
	}
	public static void round() {
		//圆形方法
		//设置PI的值
		DecimalFormat df = new DecimalFormat("#.00");
		double pi = Double.parseDouble(df.format(Math.PI));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		double r = sc.nextDouble();
		System.out.println("该圆的面积为:"+(r*r*pi));
	}
	
}
