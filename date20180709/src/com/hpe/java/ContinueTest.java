package com.hpe.java;

public class ContinueTest {

	// continue:结束当前这次循环，继续执行下一次循环

	public static void main(String[] args) {

//		test1();
		test2();

	}

	public static void test1() {

		for (int i = 0; i < 3; i++) {

			if (i == 1) {

				continue;

			}
			System.out.println(i);

		}

	}

	public static void test2() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (j == 1) {

					continue;

				}
				System.out.println("i=" + i + ",j=" + j);

			}

		}
	}

}
