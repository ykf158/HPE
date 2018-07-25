package com.hpe.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;import java.io.OutputStream;

import org.junit.Test;

public class BufferedInputOutputStream {

	@Test
	public void testBufferedInputStream() {
		//BufferedInputStream 输入流  字节流  处理流（缓冲流）
		
		/*//创建File
		File f = new File("1.txt");
		
		//创建FileInputStream
		
		FileInputStream fis = null;
		
		fis = new FileInputStream(f);
		
		//创建BufferedInputStream
		
		BufferedInputStream bis = null;
		bis = new BufferedInputStream(fis);*/
		
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("hello.txt"));
			
			byte[] b = new byte[10];
			int len;
			while ((len = bis.read(b))!=-1) {
				String str = new String(b, 0, len);
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Test
	public void testBufferedOutputStream() {
		//BufferedInputStream 输入流  字节流  处理流（缓冲流）
		
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("1.txt"));
			String str = "poiuyt";
			bos.write(str.getBytes());
			bos.flush();//将缓冲区的内容输出
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	@Test
	public void copy() {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos =null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("copy1.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));
			
			byte[] b = new byte[1024];
			int len;
			while((len = bis.read(b)) != -1) {
				
				bos.write(b, 0, len);
				bos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
}
