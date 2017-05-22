package com.imqsl.coolweather.util;

import android.text.TextUtils;

import com.imqsl.coolweather.db.City;
import com.imqsl.coolweather.db.County;
import com.imqsl.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by imqsl on 2017/5/22.
 */

public class Utility {
    public static boolean handleProvinceResponese(String responese){
        if (!TextUtils.isEmpty(responese)){
            try {
                JSONArray allProvinces=new JSONArray(responese);
                for (int i=0;i<allProvinces.length();i++) {
                    JSONObject provinceObj=allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(provinceObj.getString("name"));
                    province.setProvinceCode(provinceObj.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponese(String responese,int provinceID){
        if (!TextUtils.isEmpty(responese)){
            try {
                JSONArray allCities=new JSONArray(responese);
                for (int i=0;i<allCities.length();i++) {
                    JSONObject cityObj=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObj.getString("name"));
                    city.setCityCode(cityObj.getInt("id"));
                    city.setProvinceId(provinceID);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponese(String responese,int cityId){
        if (!TextUtils.isEmpty(responese)){
            try {
                JSONArray allCounty=new JSONArray(responese);
                for (int i=0;i<allCounty.length();i++) {
                    JSONObject countyObj=allCounty.getJSONObject(i);
                    County county=new County();
                    county.setCountryName(countyObj.getString("name"));
                    county.setWeatherId(countyObj.getString("weather_id"));
                    county.setCityID(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
