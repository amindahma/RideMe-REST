package com.codemo.RideMe.Document;

public class Booking {
    private String name;
    private String nic;
    private String pack;
    private String date;
    private String rent;

    public Booking(String name, String nic, String pack, String date, String rent) {
        this.name = name;
        this.nic = nic;
        this.pack = pack;
        this.date = date;
        this.rent = rent;
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

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", pack='" + pack + '\'' +
                ", date='" + date + '\'' +
                ", rent='" + rent + '\'' +
                '}';
    }
}
