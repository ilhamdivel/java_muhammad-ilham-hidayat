package com.praktikum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.praktikum.repository"})
public class PraktikumApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraktikumApplication.class, args);
	}

}
