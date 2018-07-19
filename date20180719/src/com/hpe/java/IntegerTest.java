package com.hpe.java;

import org.junit.Test;

public class IntegerTest {

	@Test
	public void test1() {
		
		//byte short int long float double char boolean
		//Byte Short Integer Float Double Character Boolean
		
		int a = 1;
		Integer b = Integer.valueOf(1);
		System.out.println(b);
		b = a ;
		
		
	}
	
	
	@Test 
	public void test2() {
		String str = "1";
		int a = Integer.parseInt(str);
		
	}
	
	
	@Test 
	public void test3() {
		int a = 1;
		String s = a+"";
		System.out.println(s);
		
		String s1 = Integer.toString(a);
		System.out.println(s1);
		
		String s2 = String.valueOf(a);
		System.out.println(s2);
		
	}
	
}
