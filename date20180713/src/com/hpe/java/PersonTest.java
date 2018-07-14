package com.hpe.java;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test1() {
		Person p = new Person();
		System.out.println(p.getAge());
		
		Person p1 = new Person(23,"张三","男") ;
		System.out.println(p1);
	}
	
}
