package com.example.demo.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author swetul patel, This Interface creates a User Repository model in the
 *         Mongo DB
 *
 */

@Repository
public interface SwamiRepository extends MongoRepository<SwamiModel, String> {
	//Find User By their name
	UserModel findByname(String name);

}