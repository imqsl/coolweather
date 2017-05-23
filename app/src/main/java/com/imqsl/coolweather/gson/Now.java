package com.imqsl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by imqsl on 2017/5/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
