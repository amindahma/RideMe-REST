package com.codemo.RideMe.Repository;

import com.codemo.RideMe.Document.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BikeRepository extends MongoRepository<Bike, Integer> {

}
