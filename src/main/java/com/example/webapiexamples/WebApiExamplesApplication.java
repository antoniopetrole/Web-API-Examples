package com.example.webapiexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.example.webapiexamples.models")
public class WebApiExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiExamplesApplication.class, args);
	}

}
