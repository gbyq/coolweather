package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Han on 2017/12/5.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String wetherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWetherId() {
        return wetherId;
    }

    public void setWetherId(String wetherId) {
        this.wetherId = wetherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
