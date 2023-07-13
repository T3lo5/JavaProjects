package com.sysmap.demo.api;

import com.sysmap.demo.service.user.CreateUserRequest;
import com.sysmap.demo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService _userService;
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request) {

        String response;
        response = _userService.createUser(request);
        return ResponseEntity.ok("User created");
    }

}
