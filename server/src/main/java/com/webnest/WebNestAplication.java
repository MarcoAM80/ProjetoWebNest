package com.webnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.webnest.core.repository")
@EntityScan(basePackages = "com.webnest.core.entity")
public class WebNestAplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebNestAplication.class, args);
	}

}
