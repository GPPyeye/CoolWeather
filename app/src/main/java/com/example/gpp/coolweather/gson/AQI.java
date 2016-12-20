package com.example.gpp.coolweather.gson;

/**
 * Created by 23964 on 2016/12/20.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
