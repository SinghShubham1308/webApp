package com.springboot.webApp.service;

import org.springframework.stereotype.Service;

@Service
public class Authentitcation {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Shubham");
		boolean isValidPassword = password.equalsIgnoreCase("Shubh1308");
		return isValidPassword && isValidUserName;

	}
}
