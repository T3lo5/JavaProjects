package com.sysmap.backend.redesocialbakcend.services.user;

import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface IUserRepository extends MongoRepository<User, UUID> {
    User findByEmail(String email);
}
