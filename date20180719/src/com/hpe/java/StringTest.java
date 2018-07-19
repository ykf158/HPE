package com.hpe.java;

import org.junit.Test;

public class StringTest {

	@Test
	public void test1() {
		
		StringBuffer sb = new StringBuffer();
		//通过append()拼接字符串                    
		sb.append("abc");
		sb.append("asd").append("qwe").append("zxc");
		System.out.println(sb);
		
		
	}
	
	
	
	@Test
	public void test2() {
		
		
		String str1 = "abcdef";
		System.out.println(str1.startsWith("abc"));
		int compareRes = str1.compareTo("cba");
		
		System.out.println(compareRes);
		int compareRes1 = str1.compareToIgnoreCase("ABC");
		System.out.println(compareRes1);
		String str2 = str1.replace('b', 'B');
		System.out.println(str2);
		
		
		int i = str1.indexOf("bcd");
		System.out.println(i);
	}
	
}
