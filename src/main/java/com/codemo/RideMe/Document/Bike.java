package com.codemo.RideMe.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bike {
    @Id
    private Integer id;
    private String type;
    private boolean available;
    private Integer rent;

    public Bike(Integer id, String type, boolean available, Integer rent) {
        this.id = id;
        this.type = type;
        this.available = available;
        this.rent = rent;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public Integer getRent() {
        return rent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }
}
