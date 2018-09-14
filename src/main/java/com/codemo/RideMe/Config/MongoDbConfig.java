package com.codemo.RideMe.Config;

import com.codemo.RideMe.Document.Bike;
import com.codemo.RideMe.Repository.BikeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = BikeRepository.class)
@Configuration
public class MongoDbConfig {

    @Bean
    CommandLineRunner commandLineRunner(BikeRepository bikeRepository){
        return args -> {
            bikeRepository.save(new Bike(1, "Mountain", true, 50));
            bikeRepository.save(new Bike(2, "Normal", true, 50));
        };
    }
}
