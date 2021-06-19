package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModel {

	/* This class is responsible for creating a USER cluster in MongoDB */
	
	// stores the user's id in a string
	@Id
	private String id;

	// the username/email of the user
	private String username;

	// the password for the user
	private String password;

	//the swami's name
	private String name;
	
	//Senior swami of the current swami
	private String seniorSwami;
	
	//image URL of the image of the swami
	private String image;
	
	//current centre swami is based out of
	private String centre;
	
	// Empty constructor to initialize the user model object
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
	
	//This method sets the user's image which is a URL
	public void setImage(String Image) {
		this.image = Image;
	}
	
	//This method sets the user's name
	public void setName(String Name) {
		this.name = Name;
	}
	
	//This method sets the user's centre 
	public void setCentre(String centre) {
		this.centre = centre;
	}
	
	//This method sets the user's senior swami
	public void setSeniorSwami(String swami) {
		this.seniorSwami = swami;
	}

}
