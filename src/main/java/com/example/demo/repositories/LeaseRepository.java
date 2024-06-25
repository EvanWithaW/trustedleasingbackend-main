package com.example.demo.repositories;

import com.example.demo.models.LeaseModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaseRepository extends MongoRepository<LeaseModel,String> {
}
