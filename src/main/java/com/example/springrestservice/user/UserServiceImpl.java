package com.example.springrestservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    public Map<String, UserModel> userModelMap = new HashMap<>();

    @Override
    public List<UserModel> getAllUsers() {
        return new ArrayList<>(userModelMap.values());
    }

    @Override
    public UserModel getUserById(String userUID) {
        return userModelMap.get(userUID);
    }

    @Override
    public void addUser(UserModel userModel) {
        userModelMap.put(userModel.getUser_uid(), userModel);
    }
}
