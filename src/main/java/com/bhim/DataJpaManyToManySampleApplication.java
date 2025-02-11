package com.bhim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bhim.service.Userservice;

@SpringBootApplication
public class DataJpaManyToManySampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaManyToManySampleApplication.class, args);
		Userservice service = context.getBean(Userservice.class);
		service.saveUser();
	}

}
