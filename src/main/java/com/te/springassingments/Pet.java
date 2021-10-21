package com.te.springassingments;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet implements Serializable{

	@Autowired
	@Qualifier("dog")
	private Animals dog;
	
	@Autowired
	@Qualifier("cat1")
	private Animals cat;
	private String name;
	


}
