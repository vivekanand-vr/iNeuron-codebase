package com.getitdone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProblemStatement27ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemStatement27ServerApplication.class, args);
	}

}
