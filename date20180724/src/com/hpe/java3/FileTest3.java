package com.hpe.java3;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

//File : 与平台无关的文件或目录

public class FileTest3 {
	
	@Test
	public void test1() {
		
		File file = new File("E:\\1.txt");

		String f1 = file.getName();
		System.out.println(f1);
		
		File file1 = new File("D:\\1");
		String f2 = file1.getName();
		System.out.println(f2);
		File file2 = new File("2.txt");
	}
	
	
	@Test
	public void test2() {
		File file = new File("E:/1.txt");
		File file1 = new File("2.txt");
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file1.getParentFile());
		
		System.out.println("---------------------");
		System.out.println(file1.getName());
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsoluteFile());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getParentFile());
		
		
	}
	
	
	@Test
	public void test3() throws IOException {
		
		File file = new File("E:/11.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		File file1 = new File("E:/1");
		if (!file1.exists()) {
			file1.mkdir();
			
		}
		
		File file2 = new File("D:/Program Files");
		String[] list = file2.list();
		for (String string : list) {
			System.out.println(string);
		}
		
		
		File[] listFiles = file2.listFiles();
		for (File file3 : listFiles) {
			System.out.println(file3);
		}
		
	}
	
	
}
