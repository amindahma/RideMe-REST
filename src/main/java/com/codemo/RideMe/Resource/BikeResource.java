package com.codemo.RideMe.Resource;

import com.codemo.RideMe.Document.Bike;
import com.codemo.RideMe.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BikeResource {

    @Autowired
    BikeRepository bikeRepository;

    @RequestMapping(value = "/bikes", method = RequestMethod.GET)
    public List<Bike> getBikes() {
        return bikeRepository.findAll();
    }

    @RequestMapping(value = "/addbike", method = RequestMethod.POST)
    public String createBike(@RequestParam(value="type", defaultValue="normal") String type,
                             @RequestParam(value="free", defaultValue="true") String free,
                             @RequestParam(value="rent", defaultValue="50") String rent) {
        bikeRepository.save(new Bike(Long.toString(bikeRepository.count()+1),type,free,rent));
        return "200";
    }


    @RequestMapping(value = "/deleteall", method = RequestMethod.POST)
    public String deleteAll() {
        bikeRepository.deleteAll();
        return "200";
    }

    @RequestMapping(value = "/get_bike_by_type", method = RequestMethod.POST)
    public List<Bike> findBikeByType(@RequestParam(value="type", defaultValue="normal") String type) {
        return bikeRepository.findByType(type);
    }

    @RequestMapping(value = "/get_bike_by_id", method = RequestMethod.POST)
    public Bike findBikeById(@RequestParam(value="id", defaultValue="1") String id) {
        return bikeRepository.findById(id);
    }

    @RequestMapping(value = "/update_bike_by_id", method = RequestMethod.POST)
    public Bike updateBikeById(@RequestParam(value="id", defaultValue="1") String id,
                               @RequestParam(value="free", defaultValue="true") String free) {
        Bike b =  bikeRepository.findById(id);
        b.setFree(free);
        bikeRepository.save(b);
        return b;
    }
}
