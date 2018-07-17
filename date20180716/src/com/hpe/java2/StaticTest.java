package com.hpe.java2;

import org.junit.Test;

public class StaticTest {

	@Test
	public void test() {
		 Person p1 = new Person();
		 p1.setAge(10);
		 Person p2 = new Person();
		 p2.setAge(20);
		 System.out.println(p1.getAge());
		 System.out.println(p2.getAge());
		 p1.setLegs(2);
		 p2.setLegs(4);
		 System.out.println(p1.getLegs());
		 System.out.println(p2.getLegs());
		 
	}
}
