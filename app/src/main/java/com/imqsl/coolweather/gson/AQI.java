package com.imqsl.coolweather.gson;

/**
 * Created by imqsl on 2017/5/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
