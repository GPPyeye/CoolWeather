package com.example.gpp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 23964 on 2016/12/20.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
