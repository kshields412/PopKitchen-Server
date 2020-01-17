package com.popkitchen.api.controller;

import com.popkitchen.api.model.User;
import com.popkitchen.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteUser(@RequestBody User user){
        return userService.deleteUser(user);
    }

    @PutMapping()
    public ResponseEntity<?> modifyUser(@RequestBody User user){
        return userService.modifyUser(user);
    }

    @GetMapping()
    public ResponseEntity<?> getUser(@RequestParam long userId){
        return userService.getUserById(userId);
    }

}
