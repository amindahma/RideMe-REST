package com.codemo.RideMe.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bike {

    @Id
    private String id;
    private String type;
    private String free;
    private String rent;

    public Bike(String id, String type, String free, String rent) {
        this.id = id;
        this.type = type;
        this.free = free;
        this.rent = rent;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getFree() {
        return free;
    }

    public String getRent() {
        return rent;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", free=" + free +
                ", rent=" + rent +
                '}';
    }
}
