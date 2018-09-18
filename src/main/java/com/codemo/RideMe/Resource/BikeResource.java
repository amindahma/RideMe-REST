package com.codemo.RideMe.Resource;

import com.codemo.RideMe.Document.Bike;
import com.codemo.RideMe.Document.Booking;
import com.codemo.RideMe.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Bike createBike(@RequestParam(value="type", defaultValue="normal") String type) {
        Bike bike = new Bike(Long.toString(bikeRepository.count()+1),type, new ArrayList<>());
        bikeRepository.save(bike);
        return bike;
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

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String makeBooking(@RequestParam(value="name", defaultValue="aaaaaa") String name,
                            @RequestParam(value="nic", defaultValue="234567345v") String nic,
                            @RequestParam(value="type", defaultValue="normal") String type,
                            @RequestParam(value="pack", defaultValue="uni") String pack,
                            @RequestParam(value="location", defaultValue="loc1") String location,
                            @RequestParam(value="hours", defaultValue="5") String hours,
                            @RequestParam(value="date", defaultValue="1/1/2018") String date,
                            @RequestParam(value="rent", defaultValue="100") String rent) {
        List<Bike> bikeList = bikeRepository.findByType(type);
        String id = "";
        for (Bike bike:bikeList) {
            ArrayList<Booking> bookingList = bike.getBookingList();
            if(bookingList.size() == 0){
                id = bike.getId();
                break;
            }
            boolean exist = false;
            for (Booking booking:bookingList) {
                String bd = booking.getDate();
                if(bd.equals(date)){
                    exist = true;
                    break;
                }
            }
            if(!exist){
                id = bike.getId();
                break;
            }
        }
        if(!id.equals("")){
            Bike b =  bikeRepository.findById(id);
            Booking boo = new Booking(name, nic, type, pack, location, hours, date, rent);
            ArrayList<Booking> bl = b.getBookingList();
            bl.add(boo);
            b.setBookingList(bl);
            bikeRepository.save(b);
            return id;
        }else{
            return "full";
        }

    }

    @RequestMapping(value = "/history", method = RequestMethod.POST)
    public List<Booking> getHistory(@RequestParam(value="nic", defaultValue="normal") String nic) {
        List<Bike> all =  bikeRepository.findAll();
        ArrayList<Booking> filteredList = new ArrayList<>();
        for (Bike bike:all) {
            ArrayList<Booking> bookingList = bike.getBookingList();
            for (Booking booking:bookingList) {
                String nicNo = booking.getNic();
                if(nicNo.equals(nic)){
                    filteredList.add(booking);
                }
            }

        }
        return filteredList;
    }

}
