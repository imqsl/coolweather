package com.imqsl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by imqsl on 2017/5/22.
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
