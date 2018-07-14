package com.hpe.java;

import org.junit.Test;

public class ExtendsTest {
	
	@Test
	public void test() {
		Dog d = new Dog();
		d.setAge(1);
		System.out.println(d.getAge());
		d.watchDoor();
		d.shout();
	}
}
