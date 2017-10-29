package com.in28minues.springboot.stdentservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minues")
public class StdentServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StdentServicesApplication.class, args);
		
	}
}
