package com.example.demo.models;

/**
 * @author pratik patel This class is an Authentication Request helper adapter
 *
 */

public class AuthenticationRequest {
	// The user name of user
	private String username;
	// The password of the user
	private String password;

	// Constructor to initialze an Authentication Requesr
	public AuthenticationRequest() {
		// empty Constructor
	}

	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}