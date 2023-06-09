package org.learning.userapi.controller;

import org.learning.userapi.model.UserRecord;
import org.learning.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userapi/v1")
public class UserControllerV1 {
    @Autowired
    private UserService userService;

    @GetMapping("/ping")
    public String ping() {
        return "User API V1";
    }

    @GetMapping("/allusers")
    public List<UserRecord> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/createuser")
    public UserRecord createUser(@RequestBody UserRecord userRecord) {
        return userService.createUser(userRecord);
    }
}
