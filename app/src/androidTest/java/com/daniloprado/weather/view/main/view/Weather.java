package com.daniloprado.weather.view.main.view;

import android.support.test.espresso.Espresso;

public class Weather {

    private String city;


    public Weather(String city) {
        this.city = city;

    }

    public Weather checkWeather() {

        return  this;
    }

    public CityList pressBack() {
        Espresso.pressBack();

        return new CityList();

    }
}
