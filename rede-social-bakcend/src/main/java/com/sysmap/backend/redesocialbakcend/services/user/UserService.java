package com.sysmap.backend.redesocialbakcend.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream().map(UserResponse::new).collect(Collectors.toList());
    }

    @Override
    public UserResponse getUserById(UUID id) {
        return null;
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        return null;
    }

    @Override
    public String updateUser(UUID id, UpdateUserRequest request) {
        return null;
    }

    @Override
    public String deleteUser(UUID id) {
        return null;
    }

    @Override
    public List<PostUserResponse> getUserPosts(UUID id) {
        return null;
    }

    @Override
    public String login(LoginRequest request) {
        return null;
    }

    @Override
    public String logout(UUID id) {
        return null;
    }

    @Override
    public String uploadPhoto(UUID id, String photo) {
        return null;
    }

    @Override
    public String deletePhoto(UUID id) {
        return null;
    }

    @Override
    public String updatePassword(UUID id, UpdatePasswordRequest request) {
        return null;
    }

    @Override
    public String resetPassword(ResetPasswordRequest request) {
        return null;
    }
}