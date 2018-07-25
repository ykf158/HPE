package com.hpe.java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileReaderWriterTest {

	@Test
	public void testFileReader() {
		// FileReader 输入流、输出流、字点流
		FileReader fr = null;

		try {
			fr = new FileReader("hello.txt");
			char[] c = new char[10];
			int len;
			while ((len = fr.read(c)) != -1) {
				String str = new String(c, 0, len);
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	@Test
	public void testFileWriter() {
		//FileWriter   输出流字符流、节点流
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("hellohello.txt",true);
			fw.write("星期一\n星期二");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	@Test
	public void testFileCopy() {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("hello.txt");
			fw = new FileWriter("hello1.txt");
			
			char[] c = new char[10];
			int len;
			while((len = fr.read(c))!=-1) {
				fw.write(c, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	

}
