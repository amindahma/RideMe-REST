package com.codemo.RideMe.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Bike {

    @Id
    private String id;
    private String type;
    private ArrayList<Booking> bookingList;

    public Bike(String id, String type, ArrayList<Booking> bookingList) {
        this.id = id;
        this.type = type;
        this.bookingList = bookingList;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(ArrayList<Booking> bookingList) {
        this.bookingList = bookingList;
    }
}
