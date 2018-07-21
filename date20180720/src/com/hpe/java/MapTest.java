package com.hpe.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {

	// map中存放的都是键值对， key-value

	// 主要实现类：HashMap

	@Test
	public void test1() {

		Map<String, String> map = new HashMap<>();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("aaa", "DDD");
		
		
		//遍历所有的键
		//通过KeySet方法得到所有的键的集合
		Set<String> keySet = map.keySet();
		for (String str : keySet) {
			System.out.println(str+"@");
			
		}
		
		for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
			String string = (String) it.next();
			System.out.print(string+"?");
			System.out.println(map.get(string));
		}
		
		//遍历所有的值
		//values(),可以得到所有值构成的一个collection集合
		Collection<String> values = map.values();
		for (Iterator<String> it = values.iterator(); it.hasNext();) {
			String string = (String) it.next();
			System.out.println(string+"^");
		}
		
		
		for (String string : values) {
			System.out.println(string+"&");
		}
		

		System.out.println(map);

		String remove = map.remove("aaa");
		System.out.println(remove);

		System.out.println(map);

		System.out.println(map.get("bbb"));

		System.out.println(map.containsKey("ccc"));

		System.out.println(map.containsValue("BBB"));

		System.out.println(map.size());

		System.out.println(map.isEmpty());

	}

}
