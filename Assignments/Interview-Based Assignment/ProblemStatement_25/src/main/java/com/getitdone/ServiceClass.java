package com.getitdone;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	public void createUser(String username, String email) {
		System.out.println("Creating user: " + username);
	
	}

	public void deleteUser(String username) {
		System.out.println("Deleting user: " + username);
	}
}
