package com.example.demo.services;

import com.example.demo.models.LeaseModel;
import org.springframework.stereotype.Service;

@Service
public class Leasing {

    public void postLease(LeaseModel lease) {
        // functionality to post to database
        System.out.println("Lease posted");
    }

    public LeaseModel getLease(LeaseModel lease) {
        // functionality to get from database
        System.out.println("Lease retrieved");
        return null;
    }
}
