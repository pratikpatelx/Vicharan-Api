package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author swetul patel, This class is a model to create Swami Cluster for the
 *         Mongo DB
 *
 */


@Document(collection = "Swami")
public class SwamiModel {

	/* This class is responsible for creating a SWAMI cluster in MongoDB */
	
	@Id
	// stores the user's id in a string
	public String id;
	
	// Full name of swami in BAPS
	public String name;

	// Senior swami for current swami
	public String seniorSwami;

	// image URL for swami
	public String image;
	
	//Centre swami is currently residing
	public String centre;

	// Empty constructor to initialize the swami model object
	public SwamiModel() {
		// empty constructor
	}

	// This method gets the user ID
	public String getId() {
		return id;
	}

	// This method gets the users name
	public String getSeniorSwami() {
		return seniorSwami;
	}

	// This method sets the users name
	public void ChangeName(String username) {
		this.name = username;
	}

	// This method gets the user's password
	public String getCentre() {
		return centre;
	}

	// This method sets the user's password
	public void changeCentre(String travel) {
		this.centre = travel;
	}

}
