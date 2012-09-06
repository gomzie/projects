package com.sage.videosub.repository;

import com.sage.videosub.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String username);
}