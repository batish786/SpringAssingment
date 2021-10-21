package com.te.springassingments;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnimalsConfiguration.class,PetConfiguration.class})
public class AllConfiguration {

}
