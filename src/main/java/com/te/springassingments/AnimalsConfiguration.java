package com.te.springassingments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalsConfiguration {

	@Bean("dog")
	public Animals getdog() {
		Animals animals = new Dog();
		animals.eat();
		animals.run();
		return animals;
	}
	@Bean("cat1")
	public Animals getcat() {
		Animals animals = new Cat();
		animals.eat();
		animals.run();
		return animals;
	}
}
