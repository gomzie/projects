package org.spring.mongo.repository;

import org.spring.mongo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String username);
}