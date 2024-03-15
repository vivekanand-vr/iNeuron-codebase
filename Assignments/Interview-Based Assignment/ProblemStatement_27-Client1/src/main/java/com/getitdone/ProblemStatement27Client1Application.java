package com.getitdone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ProblemStatement27Client1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProblemStatement27Client1Application.class, args);
	}

}
