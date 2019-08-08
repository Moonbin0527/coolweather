package com.coolweather.android.gson;

/**
 * Created by Moonbin on 2019/8/8.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
