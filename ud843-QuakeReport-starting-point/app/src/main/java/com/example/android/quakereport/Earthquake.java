package com.example.android.quakereport;

public class Earthquake {

    private long mTimeInMilliSeconds;

    public double mMagnitude;

    public String mLocation;

    public String mDate;


    public  Earthquake(double magnitude,String location,long timeInMilliSeconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliSeconds = timeInMilliSeconds;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getDate(){
        return mDate;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
}