package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModel {

	/* This class is responsible for creating a USER cluster in MongoDB */
	
	@Id
	// stores the user's id in a string
	private String id;

	// the username/email of the user
	private String username;

	// the password for the user
	private String password;

	// Empty constructor to initialze the user model object
	public UserModel() {
		// empty constructor
	}

	// This method gets the user ID
	public String getId() {
		return id;
	}

	// This method gets the users name
	public String getUsername() {
		return username;
	}

	// This method sets the users name
	public void setUsername(String username) {
		this.username = username;
	}

	// This method gets the user's password
	public String getPassword() {
		return password;
	}

	// This method sets the user's password
	public void setPassword(String password) {
		this.password = password;
	}

}
