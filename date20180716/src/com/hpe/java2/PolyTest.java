package com.hpe.java2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PolyTest {

	@Test
	public void test1() {

		List list = new ArrayList();
		Person p1 = new Person();
		p1.eat();
		Man m1 = new Man();
		m1.eat();
		Woman w1 = new Woman();
		w1.eat();

	}
	
	@Test
	public void test2() {
		Person p1 = new Man();//父类的引用指向子类的实例（多态的写法）
		p1.eat();
	}
	
	
	@Test
	public void test3() {
		
		Man man = new Man();
		callEat(man);
		Woman woman = (Woman) new Person();
		callEat(woman);
		
		
		
	}
	
	
	public void callEat(Person man) {
		
		man.eat();
		
	}
	
	
	@Test
	public void test4() {
		Person p1 = new Man();
		
	}
	
	
	
	
}
