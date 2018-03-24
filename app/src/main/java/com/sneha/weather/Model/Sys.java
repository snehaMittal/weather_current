package com.sneha.weather.Model;

/**
 * Created by Sneha on 24-03-2018.
 */

public class Sys {
    private int type;
    private int id;
    private String country;
    private double message;
    private double sunrise;
    private double sunset;

    public Sys(int type, int id, String country, double message, double sunrise, double sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.message = message;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(double sunrise) {
        this.sunrise = sunrise;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(double sunset) {
        this.sunset = sunset;
    }
}
