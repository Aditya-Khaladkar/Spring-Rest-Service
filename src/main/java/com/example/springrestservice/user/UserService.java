package com.example.springrestservice.user;

import java.util.List;

public interface UserService {

    List<UserModel> getAllUsers();

    UserModel getUserById(String userUID);

    void addUser(UserModel userModel);
}
