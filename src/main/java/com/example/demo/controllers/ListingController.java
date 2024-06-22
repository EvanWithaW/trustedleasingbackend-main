package com.example.demo.controllers;

import com.example.demo.models.LeaseModel;
import com.example.demo.services.PostLease;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {
    private final PostLease postLease;

    public ListingController(PostLease postLease) {
        this.postLease = postLease;
    }

    @PostMapping("/listings")
    public void postListing(@RequestBody LeaseModel lease) {
        postLease.postLease(lease);
    }
}