package com.sysmap.backend.redesocialbakcend.services.user;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    String createUser(CreateUserRequest request);
    List<UserResponse> findAllUsers();
    UserResponse findUserById(UUID id);
    String updateUser(UUID id, UpdateUserRequest request);
    void deleteUser(UUID id);
    List<PostUserResponse> getUserPosts(UUID id);
}
