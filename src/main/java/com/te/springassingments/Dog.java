package com.te.springassingments;

public class Dog implements Animals {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}

	@Override
	public void run() {
		System.out.println("Dog is Running");
	}

}
