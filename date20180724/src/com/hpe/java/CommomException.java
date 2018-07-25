package com.hpe.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class CommomException {

	@Test
	public void test1() {
		
		//
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		
	}
	
	
	@Test
	public void test2() {
		int[] a = new int[3];
		System.out.println(a[3]);
		
		
	}
	
	@Test
	public void test3() {
		
		try {
			FileInputStream fis = new FileInputStream("111.txt");
			
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("文件未找到");
		}
		
	}
	
	
	
}
