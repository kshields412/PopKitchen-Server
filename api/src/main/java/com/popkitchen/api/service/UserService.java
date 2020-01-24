package com.popkitchen.api.service;

import com.popkitchen.api.model.User;
import com.popkitchen.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean verifyUser(Long userId) {
        return userRepository.existsById(userId);
    }

    Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public ResponseEntity<?> createUser(User user) {
        ResponseEntity<?> response;
        try {
            response = new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
        } catch (Exception e) {
            response = new ResponseEntity<>("Cannot create user, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> deleteUser(User user){
        ResponseEntity<?> response;
        try{
            userRepository.delete(user);
            response = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            response = new ResponseEntity<>("Cannot delete user, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> modifyUser(User user) {
        ResponseEntity<?> response;
        try{
            userRepository.save(user);
            response = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            response = new ResponseEntity<>("Cannot modify user, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> findUserById(long userId) {
        ResponseEntity<?> response;
        try{
            userRepository.findById(userId);
            response = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            response = new ResponseEntity<>("Cannot find user, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> findUserByUserName(String userName) {
        ResponseEntity<?> response;
        try{
            userRepository.findByUserName(userName);
            response = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            response = new ResponseEntity<> ("Cannot find user, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> findAll() {
        ResponseEntity<?> response;
        try{
            userRepository.findAll();
            response = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            response = new ResponseEntity<>("Cannot find all users, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }
}
