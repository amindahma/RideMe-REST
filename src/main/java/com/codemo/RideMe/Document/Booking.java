package com.codemo.RideMe.Document;

public class Booking {

    private String id;
    private String name;
    private String nic;
    private String type;
    private String pack;
    private String location;
    private String hours;
    private String date;
    private String rent;
    private String riding;

    public Booking(String id, String name, String nic, String type, String pack, String location, String hours, String date, String rent, String riding) {
        this.setId(id);
        this.name = name;
        this.nic = nic;
        this.setType(type);
        this.pack = pack;
        this.date = date;
        this.rent = rent;
        this.location = location;
        this.hours = hours;
        this.setRiding(riding);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRiding() {
        return riding;
    }

    public void setRiding(String riding) {
        this.riding = riding;
    }
}
