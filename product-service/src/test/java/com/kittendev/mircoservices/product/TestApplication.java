package com.kittendev.mircoservices.product;

import org.springframework.boot.SpringApplication;

public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
