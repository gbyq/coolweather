package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Han on 2017/12/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weaterId;

    public Update update;

    public class  Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
