package com.sysmap.backend.redesocialbakcend.services.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.UUID;

@Data
@NoArgsConstructor
public class UserResponse {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String photo;
    private String token;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.photo = user.getPhoto();
        this.token = user.getToken();
    }
}
