package com.hpe.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferedReaderWriter {

	@Test
	public void testBufferedReader() {

		// BufferedReader 输入流、字节流、处理流
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("hello.txt"));
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Test
	public void testBufferedWriter() {

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("3.txt"));
			bw.write("星期三");
			bw.newLine();
			bw.write("星期四");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Test
	public void copy() {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader("3.txt"));
			bw = new BufferedWriter(new FileWriter("4.txt"));

			String str;
			while ((str = br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
