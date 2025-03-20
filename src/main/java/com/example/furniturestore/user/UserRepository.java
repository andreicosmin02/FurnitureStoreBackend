package com.example.furniturestore.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
    void deleteByUsername(String username);
}
