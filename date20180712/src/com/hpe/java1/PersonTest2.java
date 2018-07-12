package com.hpe.java1;

import org.junit.Test;

public class PersonTest2 {
	
	@Test
	public void test() {
		Person p = new Person();
		System.out.println(p);
		changeAge(p);
		System.out.println(p);
		
		
	}
	
	public void changeAge(Person p) {
		p.age+=1;
	}
	
	
	//封装
	@Test
	public void test3() {
		
		Person person = new Person();
		//设置age属性值
		person.age = 17;
		System.out.println(person.age);
		
		
		
	}
	
	
	@Test
	
	public void test4() {
		
		NewPerson newPerson = new NewPerson();
		newPerson.setAge(100);
		System.out.println(newPerson.getAge());
		System.out.println(newPerson.toString());
	}
	
}
