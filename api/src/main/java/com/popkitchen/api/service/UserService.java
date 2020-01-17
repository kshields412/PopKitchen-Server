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

    public User modifyTransaction(User user) {
        return userRepository.save(user);
    }

    public ResponseEntity<?> deleteUser(User user){
        ResponseEntity<?> response;
        try{
            userRepository.delete(user);
            response = new ResponseEntity<> (HttpStatus.OK);
        } catch (Exception e){
            response = new ResponseEntity<>("Cannot delete user, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }
}
