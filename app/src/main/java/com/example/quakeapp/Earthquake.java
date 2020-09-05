package com.example.quakeapp;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mMilliseconds;
    private String murl;

    public Earthquake(double magnitude, String location, String milliSeconds, String url){
        mMagnitude = magnitude;
        mMilliseconds = milliSeconds;
        mLocation = location;
        murl = url;

    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmMilliseconds() {
        return mMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getMurl() {
        return murl;
    }
}
