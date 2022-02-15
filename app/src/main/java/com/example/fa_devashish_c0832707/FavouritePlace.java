package com.example.fa_devashish_c0832707;

public class FavouritePlace {

    int id;
    String placeName;
    String address;
    String date;
    Double latitude;
    Double longitude;
    int hasVisited;


    public FavouritePlace(int id, String placeName, String address, String date, Double latitude, Double longitude, int hasVisited) {
        this.id = id;
        this.placeName = placeName;
        this.address = address;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hasVisited = hasVisited;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getHasVisited() {
        return hasVisited;
    }

    public void setHasVisited(int hasVisited) {
        this.hasVisited = hasVisited;
    }
}