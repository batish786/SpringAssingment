package com.te.springassingments;

public class Cat implements Animals{

	@Override
	public void eat() {
		System.out.println("Cat is eating");

	}
	@Override
	public void run() {
		System.out.println("Cat is Running");
	}
}
