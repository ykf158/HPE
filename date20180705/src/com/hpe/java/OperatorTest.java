package com.hpe.java;

public class OperatorTest {

	public static void main(String[] args) {
		int tPrice = 245;
		int wPrice = 570;
		int wpPrice = 320;
		int tCount = 2;
		int wCount = 1;
		int wpCount = 1;
		double discount = 0.8;
		double Pay = (tPrice * tCount + wPrice * wCount + wpPrice * wpCount) * discount;
		System.out.println(Pay);
	}

}
