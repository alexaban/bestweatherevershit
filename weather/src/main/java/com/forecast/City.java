package com.forecast;

public class City {

    private String name;
    private double latitude;
    private double longtitude;


    public City(String n, double lat, double longt){

        this.name = n;
        this.latitude = lat;
        this.longtitude = longt;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }
}
