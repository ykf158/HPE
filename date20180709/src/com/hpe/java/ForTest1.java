package com.hpe.java;

public class ForTest1 {

	public static void main(String[] args) {

//		test1();
		test2();

	}

	// for循环嵌套
	public static void test1() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				
				System.out.println("i=" + i + ",j=" + j);

			}

		}

	}

	public static void test2() {
		for (int i = 1; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				for (int k = 0; k <= 9; k++) {

					if (i * 100 + j * 10 + k == i * i * i + j * j * j + k * k * k) {

						System.out.println(i * 100 + j * 10 + k);

					}

				}
				
			}
			
		}
		
	}	

}
