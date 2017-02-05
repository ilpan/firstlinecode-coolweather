package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilpan on 2017/2/5.
 */

public class Basic {

    /**
     * 使用 @SerializedName 注解的方式来让 JSON 字段和 Java 字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
