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
	
	private String name;
	
	private String seniorSwami;
	
	private String image;
	
	private String centre;

	// Constructor to initialize an Authentication Request
	public AuthenticationRequest() {
		// empty Constructor
	}

	// Getters
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}
	
	public String getCentre() {
		return centre;
	}
	
	public String getSeniorSwami() {
		return seniorSwami;
	}
	
	//Setters
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setImage(String Image) {
		this.image = Image;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public void setCentre(String centre) {
		this.centre = centre;
	}
	
	public void setSeniorSwami(String swami) {
		this.seniorSwami = swami;
	}
}