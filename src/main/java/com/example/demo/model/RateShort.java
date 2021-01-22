package com.example.demo.model;

import java.util.Date;

public class RateShort {
    public int Cur_ID;
    public java.util.Date date;
    public float Cur_OfficialRate;

    public int getCur_ID() {
        return Cur_ID;
    }

    public void setCur_ID(int cur_ID) {
        Cur_ID = cur_ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getCur_OfficialRate() {
        return Cur_OfficialRate;
    }

    public void setCur_OfficialRate(float cur_OfficialRate) {
        Cur_OfficialRate = cur_OfficialRate;
    }
}
