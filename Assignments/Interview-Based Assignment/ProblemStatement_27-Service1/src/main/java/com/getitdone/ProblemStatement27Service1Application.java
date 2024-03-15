package com.getitdone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProblemStatement27Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProblemStatement27Service1Application.class, args);
	}

}
