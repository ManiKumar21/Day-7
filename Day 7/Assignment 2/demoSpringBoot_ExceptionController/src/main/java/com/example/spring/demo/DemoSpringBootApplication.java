package com.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.SpringBootEg.controller","com.example.SpringBootEg.model","com.example.SpringBootEg.repository","com.example.SpringBootEg.service","com.example.SpringBootEg.demoSpringBoot"})
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

}
