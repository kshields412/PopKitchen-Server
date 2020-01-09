package com.popkitchen.api.service;

import com.popkitchen.api.model.User;
import com.popkitchen.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User modifyTransaction(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
