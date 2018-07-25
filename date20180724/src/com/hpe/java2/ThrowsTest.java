package com.hpe.java2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ThrowsTest {

	@Test
	public void test1() {
		try {
			FileInputStream fis = new FileInputStream("1.txt");

			int a;

			while ((a = fis.read()) != -1) {
				System.out.print((char) a);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
