package com.example.demo.controllers;

import com.example.demo.models.LeaseModel;
import com.example.demo.services.Leasing;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LeaseController {
    private final Leasing postLease;

    public LeaseController(Leasing postLease) {
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