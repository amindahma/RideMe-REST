package com.codemo.RideMe.Repository;

import com.codemo.RideMe.Document.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BikeRepository extends MongoRepository<Bike, String> {
    public List<Bike> findByType(String type);
    public Bike findById(String id);
}
