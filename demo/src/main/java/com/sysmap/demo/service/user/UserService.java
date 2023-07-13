package com.sysmap.demo.service.user;

import com.sysmap.demo.data.UserRepository;
import com.sysmap.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository _userRepository;
    public String createUser(CreateUserRequest request){
        var user = new User(request.getName(), request.getEmail(), request.getPassword());

        _userRepository.save(user);

        return user.getId().toString();
    }
}
