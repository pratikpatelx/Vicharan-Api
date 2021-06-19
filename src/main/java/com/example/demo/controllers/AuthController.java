package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.AuthenticationRequest;
import com.example.demo.models.AuthenticationResponse;
import com.example.demo.models.UserModel;
import com.example.demo.models.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.utils.JwtUtils;

/**
 * @author Pratik Patel, This class is an Authentication controller, define all
 *         the api endpoints for authentication here
 *
 */
@RestController
public class AuthController {

	@Autowired
	// the user repository
	private UserRepository userRepository;

	@Autowired
	// authentication manager
	private AuthenticationManager authManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtUtils jwtutils;

	@PostMapping("/login")
	/*
	 * This method gets the user name and password for the user in the api request
	 * to localhost/login and verifies if we have a user in the DB then we have
	 * successfully logged in otherwise we throw an error.
	 */
	private ResponseEntity<?> authenticateUser(@RequestBody AuthenticationRequest authenticationRequest) {
		// get the username
		String username = authenticationRequest.getUsername();
		// get the password
		String password = authenticationRequest.getPassword();
		
		

		// checks if credentials entered are correct or not
		try {
			authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			// if credentials are not correct throw an error
		} catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error: User Log In Failed" + e));
		}
		
		UserDetails loadUser = userService.loadUserByUsername(username);
		String generatedToken = jwtutils.generateToken(loadUser);
		
		// return the correct message
		return ResponseEntity.ok(new AuthenticationResponse(generatedToken));

	}

	@PostMapping("/register")
	/*
	 * This method register's the user on the DB, and username and password is
	 * stored on the DB if the user is added then a message is displayed otherwise
	 * an error is displayed
	 */
	private ResponseEntity<?> registerUser(@RequestBody AuthenticationRequest authenticationRequest) {
		// get the username
		String username = authenticationRequest.getUsername();
		// get the password
		String password = authenticationRequest.getPassword();
		// Create a UserModel object for every user that will be registered
		UserModel userModel = new UserModel();
		// set the username in the DB
		userModel.setUsername(username);
		// set the password in the DB
		userModel.setPassword(password);

		// save the user otherwise throw an error
		try {
			userRepository.save(userModel);

		} catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error: Registering User Fauiled: " + e));
		}

		return ResponseEntity.ok(new AuthenticationResponse("SucessFully Registered User: " + username));
	}
	
	//image API endpoint
	
	@PostMapping("/user")
	private String testUser(@RequestBody String id)
	{
		return "Hello" + id;
		
	}
	
	@PostMapping("/dashboard")
	private String testingToken() {
		return "Welcome to the Dashboard " + SecurityContextHolder.getContext().getAuthentication().getName();

	}

}
