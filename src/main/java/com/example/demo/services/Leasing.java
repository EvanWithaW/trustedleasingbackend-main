package com.example.demo.services;

import com.example.demo.models.LeaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Leasing {

    @Autowired
    private LeaseRepository leaseRepository;

    public void postLease(LeaseModel lease) {
        // functionality to post to database
        leaseRepository.save(lease);
        System.out.println("Lease posted");
    }

    public LeaseModel getLease(String id) {
        // functionality to get from database
        return leaseRepository.findById(id).orElse(null);

    }
}
