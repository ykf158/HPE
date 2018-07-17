package com.hpe.java;

public class Manager extends Employee{
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	
	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("经理");
		
	}
	
	@Override
	public void pay() {
		System.out.println(getBonus()+getSalary());
	}
	
	
}
