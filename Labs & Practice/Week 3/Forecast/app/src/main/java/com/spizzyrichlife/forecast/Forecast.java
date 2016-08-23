package com.spizzyrichlife.forecast;

/**
 * Created by SpizzyRich on 8/16/16.
 */
public class Forecast {
    private String day;
    private String high;
    private String low;

    public Forecast(String day, String high, String low) {
        this.day = day;
        this.high = high;
        this.low = low;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }
}
