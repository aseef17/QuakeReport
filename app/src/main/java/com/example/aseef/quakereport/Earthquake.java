package com.example.aseef.quakereport;


public class Earthquake {

    // Website URL of the earthquake
    private String mUrl;

    //magnitude of earthquake
    private Double mMagnitude;

    //location of the earthquake
    private String mLocation;

    //date of the earthquake
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param Magnitude is the magnitude (size) of the earthquake
     * @param Location is the location where the earthquake happened
     * @param TimeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(Double Magnitude,String Location,long TimeInMilliseconds,String url){
        mMagnitude=Magnitude;
        mLocation=Location;
        mTimeInMilliseconds=TimeInMilliseconds;
        mUrl = url;
    }

    //returns magnitude of earthquake
    public Double getmMagnitude(){
        return mMagnitude;
    }

    //returns location of earthquake
    public String getmLocation(){
        return mLocation;
    }

    //returns time of earthquake
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    //Returns the website URL to find more information about the earthquake.
    public String getUrl() {
        return mUrl;
    }


}
