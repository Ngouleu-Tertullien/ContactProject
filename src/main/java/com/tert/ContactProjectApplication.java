package com.tert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactProjectApplication.class, args);
		
		System.out.println("Your application has started");
	}

}
