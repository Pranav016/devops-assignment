package com.example.devopsassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PranavApplication {

	public static void main(String[] args) {
		SpringApplication.run(PranavApplication.class, args);

		// Bug: Division by zero
		int a = 10;
		int b = 0;
		int result = a / b;  // This will cause an ArithmeticException

		// Vulnerability: SQL Injection
		String username = getUserInput();  // Assuming user input as a string
		String sqlQuery = "SELECT * FROM users WHERE username = '" + username + "'";  // Vulnerable to SQL injection

		// Code Smell: Long method
		longMethod();
	}

	public static void longMethod() {
		// A long sequence of code...
		// ...
		// ...
		// ...
		// More code...
	}

	// Utility method to simulate user input
	private static String getUserInput() {
		return "John'; DROP TABLE users; --";
	}
}
