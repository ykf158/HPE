package com.hpe.java;

public class DataType {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		long c = b;
		float d = 4.4f;
		char e = '\n';
		System.out.println(e);
		String i = "2";
		System.out.println(i+a);
		int j = Integer.parseInt(i);
		System.out.println(j+a);
		System.out.println('a'+1+"abc");
		System.out.println('a'+"abc"+1);
		
		String k = "11.11";
		double l = Double.parseDouble(k);
		System.out.println(l);
		int m = 3;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		
		if(++m == 4) {
			System.out.println("true");
		}
		

		
		int r = 2;
		int s = 2;
		if(r > s & ++r == s) {
			System.out.println("abc");
		}
		
		int t = r > s ? r : s;
		System.out.println(t);
		
	}

}
