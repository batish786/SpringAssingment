package com.te.springassingments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfiguration {
	
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Dog");
		return pet;
		
	}

}
