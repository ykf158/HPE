package com.hpe.java2;

import org.junit.Test;

public class ExceptionTest {

	@Test
	public void test1() {

		int a = 10;
		int b = 0;
		try {
			int c = a / b;
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("算术异常，除数不能为0");
		}
		

	}

}
