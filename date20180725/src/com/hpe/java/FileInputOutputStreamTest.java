package com.hpe.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileInputOutputStreamTest {

	
	//					字节流（输入流）			字节流（输出流）			字符流（输入流）	字符流（输出流）
	//抽象基类			InputStream				OutputStream			Reader			Writer
	//节点流			FileInputStream 		FileOutputSteam			FileReader		FileWriter
	//缓冲流（处理流）	    BufferedInputStream 	BufferedOutputStream	BufferedReader	BufferedWriter	
	
	
	@Test
	public void test1() {
		
		//声明输入输出流对象
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//对象初始化
			fis = new FileInputStream("1PF9142007-7.jpg");
			fos = new FileOutputStream("copy1.jpg");
			
			//边读边写
			byte[] b = new byte[1024];
			int len;
			while((len = fis.read(b))!=-1) {
				fos.write(b,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
