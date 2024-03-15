package com.getitdone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MainRunner implements CommandLineRunner {
	@Autowired
	private ServiceClass service;

	@Override
	public void run(String... args) throws Exception {
		service.createUser("nitin", "nitin@ineuron.com");
		service.deleteUser("nitin");

	}

}
