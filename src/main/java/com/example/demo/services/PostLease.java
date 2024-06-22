package com.example.demo.services;

import com.example.demo.models.LeaseModel;
import org.springframework.stereotype.Service;

@Service
public class PostLease {

    public void postLease(LeaseModel lease) {
        // functionality to post to database
        System.out.println("Lease posted");
    }
}
