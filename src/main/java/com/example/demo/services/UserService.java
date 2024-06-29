package com.example.demo.services;

import com.example.demo.models.LeaseModel;
import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void postLease(UserModel user) {
        // functionality to post to database
        userRepository.save(user);
        System.out.println("Lease posted");
    }

    public UserModel getLease(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
