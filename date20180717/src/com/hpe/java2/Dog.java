package com.hpe.java2;

public class Dog extends Animal implements IWatchDoor, IBite {

	@Override
	public void shout() {
		System.out.println("汪汪汪");
	}

	// 看门
	@Override
	public void watchDoor() {
		System.out.println("狗看门");
	}

	@Override
	public void bite() {
		System.out.println("狗咬人");
	}

	// 咬

}
