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

    @PostMapping("/user/create")
    public ResponseEntity<?> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("/user/remove")
    public ResponseEntity<?> deleteUser(@RequestBody User user){
        return userService.deleteUser(user);
    }

    @PutMapping("/user/update")
    public ResponseEntity<?> modifyUser(@RequestBody User user){
        return userService.modifyUser(user);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> findUserById(@RequestParam long userId){
        return userService.findUserById(userId);
    }

    @GetMapping("/user/{userName}")
    public ResponseEntity<?> findUserByUserName(@PathVariable String userName){
        return userService.findUserByUserName(userName);
    }

    @GetMapping("/user")
    public ResponseEntity<?> findAll() {
        return userService.findAll();
    }

}
