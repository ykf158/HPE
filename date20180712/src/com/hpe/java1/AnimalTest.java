package com.hpe.java1;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void test() {
		Animal animal = new Animal();
		animal.setAge(22);
		animal.setSex("公");
		System.out.println(animal.getAge());
		System.out.println(animal.getSex());
		
	}
	
}
