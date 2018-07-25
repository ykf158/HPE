package com.hpe.java3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

//io流分类
//按流向划分:输入流、输出流
//按单位划分:字节流、字符流
//按角色划分:字点流、处理流

public class FileInputStreamTest {

	@Test
	public void test1() {

		// 读取hello.txt中的内容到程序中
		// 1.找到文件
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			// 2.打通管道(创建流的对象)FileInputStream(输入流、字节流、节点流)
			fis = new FileInputStream(file);
			// 3.读
			int a;
			while ((a = fis.read()) != -1) {
				System.out.print((char) a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void test2() {

		// 读取hello.txt中的内容到程序中
		// 1.找到文件
		FileInputStream fis = null;
		try {
			// 2.打通管道(创建流的对象)FileInputStream(输入流、字节流、节点流)
			fis = new FileInputStream("hello.txt");
			// 3.读
			int a;
			while ((a = fis.read()) != -1) {
				System.out.print((char) a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void test3() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			int a;
			while ((a = fis.read()) != -1) {

				System.out.println((char) a);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
		}

	}

	@Test
	public void test4() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			byte[] b = new byte[2];// 用于保存每次读取的字节
			int len;// 用于保存每次读取的长度

			while ((len = fis.read(b)) != -1) {

				/*for (int i = 0; i < len; i++) {
					System.out.print((char) b[i]);
				}*/
				
				String str = new String(b, 0, len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
		}

	}

}
