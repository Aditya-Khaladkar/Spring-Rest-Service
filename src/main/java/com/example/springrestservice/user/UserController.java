package com.example.springrestservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserModel> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping
    public void addUser(@RequestBody UserModel userModel) {
        userService.addUser(userModel);
    }

    @DeleteMapping("/{userUID}")
    public void deleteUser(@PathVariable String userUID) {
        userService.deleteUser(userUID);
    }
}
