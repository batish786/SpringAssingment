package com.te.springassingments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalsTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfiguration.class);
		Pet pet=context.getBean("getPet",Pet.class);
		System.out.println(pet);
		System.out.println(pet.getName());
	}
}
