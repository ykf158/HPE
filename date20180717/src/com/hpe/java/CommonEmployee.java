package com.hpe.java;

public class CommonEmployee extends Employee{

	public CommonEmployee() {
		super();
	}

	public CommonEmployee(String name, String id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println("普通员工");
	}

	@Override
	public void pay() {
		System.out.println(getSalary());
	}
}
