package com.hpe.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class ListTest {

	// List是一个接口，其中可以存放有序的、可重复的元素
	@Test
	public void test() {

		List list = new ArrayList<>();
		// 添加元素
		list.add("abc");
		list.add("abc");
		list.add(1);
		System.out.println(list);

		// 插入add(int,Object)
		list.add(1, "bcd");
		System.out.println(list);

		// 删除指定位置的元素,删除索引是1的元素
		Object removeRes = list.remove(1);
		System.out.println(removeRes);

		Object e = list.set(1, "bcd");
		System.out.println(e);

		Object o = list.get(0);
		System.out.println(o);

	}

	@Test
	public void test2() {
		List<String> list = new ArrayList<String>();

		list.add("qwe");
		list.add("asd");
		list.add("zcx");
		list.add("rty");

		// 方式一:增强for循环
		for (String l : list) {
			System.out.println(l);

		}
		System.out.println();

		// 方式二：迭代器
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println();

		// 方式三
		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i);
			System.out.println(str);

		}

	}

	@Test
	public void test3() {
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("zhangsan", 1);
		Person p2 = new Person("lisi", 2);
		Person p3 = new Person("wangwu", 3);
		Person p4 = new Person("zhaoliu", 4);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		System.out.println("请输入要删除人的姓名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		/*
		 * boolean flag = true; for (int i = 0; i < list.size(); i++) { // 得到当前的Person
		 * Person p = list.get(i); // 得到当前的person的name String name2 = p.getName(); //
		 * 得到当前person的name与输入的name进行比较，如果相同，就删除 if (name2.equals(name)) {
		 * list.remove(i); System.out.println("删除成功"); flag = false; break; }
		 * 
		 * } if (flag) { System.out.println("不存在"); }
		 */

		/*
		 * int index = findPersonByName(list, name); if (index!=-1) {
		 * 
		 * System.out.println(list.remove(index)); System.out.println("删除成功"); }else {
		 * System.out.println("查无此人"); }
		 * 
		 * showList(list);
		 */

		// 修改
		int index = findPersonByName(list, name);
		if (index != -1) {
			System.out.println("请输入新的名字");
			String newName = sc.nextLine();
			System.out.println("请输入新的年龄");
			int newAge = sc.nextInt();
			
			
			System.out.println(list.set(index,new Person(newName,newAge)));
			System.out.println("修改成功");
		} else {
			System.out.println("查无此人");
		}

		showList(list);

	}

	public int findPersonByName(List<Person> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			String name1 = p.getName();
			if (name.equals(name1)) {
				return i;

			}

		}

		return -1;
	}

	public void showList(List<Person> list) {

		for (Person p : list) {
			System.out.println(p.getName());
		}

		/*
		 * for (Iterator it = list.iterator(); it.hasNext();) { Person p = (Person)
		 * it.next(); System.out.println(p.getName());
		 * 
		 * }
		 */

	}

}
