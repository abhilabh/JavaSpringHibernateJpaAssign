package com.SpringBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeansApplication implements CommandLineRunner {
	@Autowired
	private Employee employee;
	public static void main(String[] args) {

		SpringApplication.run(SpringBeansApplication.class, args);
		SpringBeansApplication test = new SpringBeansApplication();
	}
	@Override
	public void run(String... args) {
		System.out.println(employee);
	}

}
