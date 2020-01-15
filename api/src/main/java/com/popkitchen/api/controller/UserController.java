package com.popkitchen.api.controller;

import com.popkitchen.api.model.User;
import com.popkitchen.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

//    @PostMapping()
//    public ResponseEntity<?> createUser(@RequestBody User user){
//        return service.createUser(user);
//    }
//
//    @DeleteMapping()
//    public ResponseEntity<?> deleteUser(@RequestBody){
//        return service.deleteUser();
//    }
//
//    @PutMapping()
//    public ResponseEntity<?> updateUser(@RequestBody){
//
//    }
//
//    @GetMapping()
//    public ResponseEntity<?> getUser(@RequestBody){
//
//    }

}
