package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ilpan on 2017/2/5.
 */

public class Suggestion {

    @SerializedName("conf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}