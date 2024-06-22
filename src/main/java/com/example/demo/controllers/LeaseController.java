package com.example.demo.controllers;

import com.example.demo.models.LeaseModel;
import com.example.demo.services.Leasing;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "Content-Type")
public class LeaseController {
    private final Leasing postLease;

    public LeaseController(Leasing postLease) {
        this.postLease = postLease;
    }

    @PostMapping("/lease")
    public void postListing(@RequestBody LeaseModel lease) {
        postLease.postLease(lease);
    }

    @GetMapping("/lease")
    public void getLease(@RequestBody LeaseModel lease) {
        postLease.getLease(lease);
    }
}