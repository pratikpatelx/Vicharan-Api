package com.example.demo.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pratik patel, This Interface creates a User Repository model in the
 *         Mongo DB
 *
 */

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
	//Find User By their name
	UserModel findByUsername(String username);

}