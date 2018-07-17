package com.hpe.java;

public class Test {

	public static void main(String[] args) {
		Employee e = new Manager("1","1",2000,1000);
		e.work();
		e.pay();
		
		Employee e1 = new CommonEmployee("1","1",2000);
		e1.work();
		e1.pay();
	}

}
