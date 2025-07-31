package com.oscarjg.neobanco2.controller;

import com.oscarjg.neobanco2.model.User;
import com.oscarjg.neobanco2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserRequest userRequest) {
        User user = userService.registerUser(
                userRequest.getUsername(),
                userRequest.getPassword(),
                userRequest.getRole()
        );
        return ResponseEntity.ok(user);
    }
}

class UserRequest {
    private String username;
    private String password;
    private String role;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}