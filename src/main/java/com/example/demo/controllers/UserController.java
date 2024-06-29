package com.example.demo.controllers;

import com.example.demo.models.LeaseModel;
import com.example.demo.models.UserModel;
import com.example.demo.services.LeasingService;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public void postUser(@RequestBody UserModel user) {
        userService.postLease(user);
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable String id) {
        return userService.getLease(id);
    }




}