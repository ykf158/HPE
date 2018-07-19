package com.hpe.java;

import org.junit.Test;

public class ObjectTest {

	//Object类没有父类，所有类都是object的子类，
	//所有类都继承了Object类的方法，比如toString()
	
	@Test
	public void test1() {
		//Object是所有类的父类（不是直接继承就是间接继承）
		//所有类都继承了Object的方法
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person();
		System.out.println(p1.equals(p2));
		
		String str = new String("adf");
		//String类已经重写了Object的toString()方法
		System.out.println(str.toString());
		
	}
	
	@Test
	public void test2() {
		String s1 = "asd";
		String s2 = "asd";
		System.out.println(s1.equals(s2));
	}
	
}
