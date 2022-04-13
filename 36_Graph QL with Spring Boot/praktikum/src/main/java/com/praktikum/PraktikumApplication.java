package com.praktikum;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class PraktikumApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktikumApplication.class, args);
    }

}
