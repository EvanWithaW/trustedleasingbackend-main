package com.example.demo.controllers;

import com.example.demo.models.LeaseModel;
import com.example.demo.services.LeasingService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LeaseController {
    private final LeasingService postLease;

    public LeaseController(LeasingService postLease) {
        this.postLease = postLease;
    }

    @PostMapping("/lease")
    public void postListing(@RequestBody LeaseModel lease) {
        postLease.postLease(lease);
    }

    @GetMapping("/lease/{id}")
    public LeaseModel getLease(@PathVariable String id) {
        return postLease.getLease(id);
    }
}