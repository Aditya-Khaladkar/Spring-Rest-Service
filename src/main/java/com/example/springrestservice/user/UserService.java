package com.example.springrestservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    // CREATE
    public UserModel addUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    // GET ALL USER
    public List<UserModel> getAllUser() {
        return userRepository.findAll();
    }
}
