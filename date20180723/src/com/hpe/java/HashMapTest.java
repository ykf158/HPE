package com.hpe.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		Person p1 = new Person(11, "zhangsan");
		Person p2 = new Person(12, "lisi");
		Person p3 = new Person(13, "wangwu");
		
		Map<String, Person> map = new HashMap<>();
		map.put("p1", p1);
		map.put("p2", p2);
		map.put("p3", p3);
		
		showMap(map);
	}
	
	
	//打印map中的所有values
	public void showMap(Map<String, Person> map) {
		/*Collection<Person> values = map.values();
		for (Person person : values) {
			System.out.println(person.getName());
		}*/
		
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(map.get(string).getName()+"__");
		}
		
		Set<Entry<String,Person>> entrySet = map.entrySet();
		for (Entry<String, Person> entry : entrySet) {
			System.out.println(entry.getValue().getName()+"&&");
			
		}
	}
	
}
