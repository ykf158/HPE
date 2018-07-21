package com.hpe.java;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetTest {

	//set:Set存放的元素是无序的，不可重复的
	@Test
	public void test() {
		
		
		Person p1 = new Person("zhangsan", 1);
		Person p2 = new Person("lisi", 2);
		Person p3 = new Person("wangwu", 3);
		Person p4 = new Person("zhaoliu", 4);
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p4);
		
		System.out.println(set);
		
		
		
	}
	
}
