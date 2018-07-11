package com.hpe.java;

import org.junit.Test;

public class ArrayTest4 {

	@Test
	public void test1() {
		int[] a = {1,2,5,4,5,6,9};
		ArrayTest3 a3 =new ArrayTest3();
		a3.show(a);
		plus(a);
		a3.show(a);
	}
	
	/**
	 * @category Plus
	 * @param Array
	 */

	public void plus(int[] arr) {
		//将数组元素+1
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=1;
		}
	}
	
}
