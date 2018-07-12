package com.hpe.java1;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		int age = p.age;
		String name = p.name;
		char sex = p.sex;
		p.age = 10;
		System.out.println(p.age+" "+p.name+" "+p.sex);
		
		
		
	}

} 
