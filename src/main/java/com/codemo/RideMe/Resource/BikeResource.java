package com.codemo.RideMe.Resource;

import com.codemo.RideMe.Document.Bike;
import com.codemo.RideMe.Repository.BikeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class BikeResource {

    private BikeRepository bikeRepository;

    public BikeResource(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping("/all")
    public List<Bike> getAll(){
        return bikeRepository.findAll();
    }

    @GetMapping("/")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello "+ name;
    }
}
