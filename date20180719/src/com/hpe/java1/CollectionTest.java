package com.hpe.java1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class CollectionTest {
	
	@Test 
	public void test1() {
		Collection col = new ArrayList<>();//多态
		//使用add(Object)
		
		col.add("asd");
		col.add("qwe");
		col.add(1);
		System.out.println(col);
		
	/*	col.clear();
		System.out.println(col);*/
		
		System.out.println(col.isEmpty());
		
		System.out.println(col.size());
	}
	
	
	
	@Test
	public void test2() {
		
		Collection col = new ArrayList<>();
		col.add("123");
		col.add("qwe");
		col.add(1);
		col.add("asd");
		
		for (Object o : col) {
			System.out.println(o+" ");
		}
		
		
		for (Iterator it = col.iterator(); it.hasNext();) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		
		
	}
	

}
