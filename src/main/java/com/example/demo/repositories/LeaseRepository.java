package com.example.demo.repositories;

import com.example.demo.models.LeaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepository extends JpaRepository<LeaseModel, String> {
}