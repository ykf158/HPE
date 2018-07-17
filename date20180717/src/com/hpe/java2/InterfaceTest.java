package com.hpe.java2;

import org.junit.Test;

public class InterfaceTest {

	@Test
	public void test() {
		Dog d = new Dog();
		d.shout();
		d.watchDoor();
		d.bite();
		
		Animal a = new Dog();
		a.shout();
		((Dog) a).bite();
	}
	
}
